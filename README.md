# monitor-website-availability
An application to monitor web sites and report their availability.

--- 
This is a work in progress project for now, but it intends to read a list of URLs from a JSON file and check whether those URLs contain up and running websites, or if they are down.

These results will be then reported visually within the app.

That's that.

---

# How to run the app?

For tests run the following:

```./gradlew test```

For the main application run:

```./gradlew bootRun```

then navigate to localhost:8080 with your browser.

## Developer instructions

This is a Java Spring Boot Web Application.

Suggested development tools are (regardless of OS):
* IntelliJ IDEA for backend.
* Visual Studio Code for frontend.
* dBeaver for database.


## Backend

Architecture decisions based on maximum compatibility for supporting and extending with opensource libraries.

* Java 1.8 OpenJDK (For license clarity)
* Spring 2.7.2-SNAPSHOT (For compatibility)
  * spring-boot-devtools for code live reload for fast development iteration times.
  * spring-boot-starter-tomcat for fast web serving, goal to deploy to dockerized tomcat:jdk8/corretto

## Frontend
* Html for now, more to come later.

## Database
* To be decided... Probably going with PostgreSQL because it's awesome and opensource.


Please note, running SonarQube locally while developing this, will required JDK 11.
  