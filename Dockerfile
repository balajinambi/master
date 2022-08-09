FROM openjdk:11
ADD sample-spring-boot-app.jar sample-spring-boot-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "sample-spring-boot-app.jar"]