FROM openjdk:17-oracle

VOLUME /tmpDockerfile

LABEL description="Common module"

COPY target/common-0.1-SNAPSHOT.jar /common-0.1-SNAPSHOT.jar

EXPOSE 8077

ENTRYPOINT [ "java", "-jar", "/common-0.1-SNAPSHOT.jar" ]
