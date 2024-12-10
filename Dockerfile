FROM openjdk:17-jdk-slim
COPY simplefordeploy-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080