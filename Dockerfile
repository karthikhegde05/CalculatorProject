FROM openjdk:8
COPY ./target/miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "./target/miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]
