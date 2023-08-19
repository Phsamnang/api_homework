FROM openjdk:19-alpine

# Setting up work directory
WORKDIR /app

# Copy the jar file into our app
COPY ./target/springdeploy-0.0.1-SNAPSHOT.jar /app

# Exposing port 8080
EXPOSE 8080

# Starting the application
CMD ["java", "-jar", "springdeploy-0.0.1-SNAPSHOT.jar"]
