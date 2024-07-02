FROM eclipse-temurin:17

LABEL mentainer="shrikant.agiwal@hotmail.com"

WORKDIR /app

COPY target/testbench-1.0-SNAPSHOT.jar /app/testbench-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "testbench-1.0-SNAPSHOT.jar"]
