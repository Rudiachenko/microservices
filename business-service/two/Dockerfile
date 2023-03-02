FROM java:17-jre-alpine

VOLUME /tmp

LABEL description="Two module"

COPY target/two-0.1-SNAPSHOT.jar /two-0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/two-0.1-SNAPSHOT.jar" ]
