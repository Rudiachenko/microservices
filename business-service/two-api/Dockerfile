FROM openjdk:17-oracle

VOLUME /tmp

LABEL description="Two-API module"

COPY target/two-api-0.1-SNAPSHOT.jar /two-api-0.1-SNAPSHOT.jar

EXPOSE 8083

ENTRYPOINT [ "java", "-jar", "/two-api-0.1-SNAPSHOT.jar" ]
