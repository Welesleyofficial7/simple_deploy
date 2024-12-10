FROM openjdk:17-jdk-slim
COPY target/simplefordeploy-1.0-SNAPSHOT-runner.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080