FROM openjdk:11
ADD target/acik-kaynak-0.0.1-SNAPSHOT.jar acik-kaynak.jar
ENTRYPOINT ["java", "-jar", "acik-kaynak.jar"]