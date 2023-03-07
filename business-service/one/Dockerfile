FROM openjdk:17-oracle

VOLUME /tmp

LABEL description="One module"

COPY target/one-0.1-SNAPSHOT.jar /one-0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT [ "java", "-jar", "/one-0.1-SNAPSHOT.jar" ]
