# Overview

This is a simple project for sanity checking the auto timestamp (date created, last updated) handling in GORM with 
multiple data sources.

If multiple data sources are defined in application.yml then date created values are not automatically set and
a violation exception is thrown.

# Build

Run the following command to start the server.

```
./gradlew run
```

Perform a GET request to the following URL: http://locahost:8080

