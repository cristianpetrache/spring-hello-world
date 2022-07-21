FROM openjdk:17.0
WORKDIR /usr/src/demo
COPY target/spring-hello-world-0.0.1-SNAPSHOT.jar /usr/src/demo
CMD ["java", "-jar", "spring-hello-world-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080