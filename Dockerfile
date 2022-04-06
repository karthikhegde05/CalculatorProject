FROM openjdk:8
WORKDIR ./
COPY .target/miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
CMD ["java", "-jar", "miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
