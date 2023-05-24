#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim as build

#Information around who maintains the image
MAINTAINER net.katherine

# Add the application's jar to the container
COPY target/microservice-account-0.0.1-SNAPSHOT.jar microservice-account-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","microservice-account-0.0.1-SNAPSHOT.jar"]