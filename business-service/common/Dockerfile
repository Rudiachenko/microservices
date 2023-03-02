FROM java:17-jre-alpine

VOLUME /tmpDockerfile

LABEL description="Common module"

COPY target/common-0.1-SNAPSHOT.jar /common-0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/common-0.1-SNAPSHOT.jar" ]
