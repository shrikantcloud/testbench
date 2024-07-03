FROM openjdk:17-alpine

LABEL mentainer="shrikant.agiwal@hotmail.com"

WORKDIR /app

COPY target/testbench-1.0-SNAPSHOT.jar /app/testbench-1.0-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "testbench-1.0-SNAPSHOT.jar"]
