FROM openjdk:23-jdk-slim
WORKDIR /app
CMD ["./gradlew", "clean", ":cuentaflex-applications-account-service:bootJar"]
COPY cuentaflex/applications/account-service/build/libs/*.jar app.jar

EXPOSE 8080