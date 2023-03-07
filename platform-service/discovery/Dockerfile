FROM openjdk:17-oracle

VOLUME /tmp

LABEL description="Discovery module 'Eurika-Server'"

COPY target/discovery-0.1-SNAPSHOT.jar /discovery-0.1-SNAPSHOT.jar

EXPOSE 8761

ENTRYPOINT [ "java", "-jar", "/discovery-0.1-SNAPSHOT.jar" ]
