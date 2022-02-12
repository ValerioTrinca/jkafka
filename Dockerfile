FROM openjdk:17-oracle
LABEL manteiner="valeriotrinca"
ADD target/kafka-test-spring-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker.jar"]