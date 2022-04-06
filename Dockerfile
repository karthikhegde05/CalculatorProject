FROM openjdk:8
COPY .target/miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
