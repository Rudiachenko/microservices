FROM openjdk:17-oracle

VOLUME /tmp

LABEL description="Two module"

COPY target/two-0.1-SNAPSHOT.jar /two-0.1-SNAPSHOT.jar

EXPOSE 8082

ENTRYPOINT [ "java", "-jar", "/two-0.1-SNAPSHOT.jar" ]
