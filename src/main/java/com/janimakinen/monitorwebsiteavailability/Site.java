package com.janimakinen.monitorwebsiteavailability;

public class Site {

    private String url;
    private int checkIntervalMS;
    private String mustContainText;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCheckIntervalMS() {
        return checkIntervalMS;
    }

    public void setCheckIntervalMS(int checkIntervalMS) {
        this.checkIntervalMS = checkIntervalMS;
    }

    public String getMustContainText() {
        return mustContainText;
    }

    public void setMustContainText(String mustContainText) {
        this.mustContainText = mustContainText;
    }
}
