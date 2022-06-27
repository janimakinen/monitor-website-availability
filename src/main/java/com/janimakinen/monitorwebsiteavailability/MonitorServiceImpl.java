package com.janimakinen.monitorwebsiteavailability;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {

    private final RestTemplate restTemplate;

    public MonitorServiceImpl(List<Site> sites, RestTemplateBuilder restTemplateBuilder) {
        this.sites = sites;
        this.restTemplate = restTemplateBuilder.build();
    }

    /**
     * Deserialize a list of sites from a json file that will be monitored by this application.
     */
    private void refreshSiteConfig() {
        if ( sites == null )
            sites = new ArrayList<Site>();

        if (getSites().size() <= 0) {
            Gson gson = new Gson();
            try {
                JsonReader reader = new JsonReader(new FileReader("sites.json"));
                Site[] siteList = gson.fromJson(reader, Site[].class);
                System.out.println("siteList:" + siteList);
                this.setSites(Arrays.asList(siteList));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    private List<Site> sites;

    public String monitorURLs() {
        this.refreshSiteConfig();
        return this.monitorAllSites();
    }

    //TODO: Springs own RestTemplate has lacking UnknownHostException handling, have to replace the library.
    private String monitorAllSites() {
        List<String> results = new ArrayList<>();
        this.sites.forEach(a -> {
            try {
                this.restTemplate.getForObject(a.getUrl(), String.class);
                results.add("URL GET OK: " + a.getUrl());
            } catch(RestClientException e) {
                results.add("URL GET FAIL: " + a.getUrl() + " ERROR: " + e.getMessage());
            }
        });
        return String.join("<br/> ", results);
    }
}
