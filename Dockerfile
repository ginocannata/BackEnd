FROM amazoncorretto:17-alpine-jdk
MAINTAINER GC
COPY target/GC-0.0.1-SNAPSHOT.jar  gc-app.jar
ENTRYPOINT  ["java","-jar","/gc-app.jar"]
