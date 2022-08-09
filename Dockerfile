FROM maven:3.6.0-jdk-11-slim AS build
RUN mvn -f pom.xml clean build

FROM openjdk:11
ADD target/sample-spring-boot-app.jar sample-spring-boot-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "sample-spring-boot-app.jar"]