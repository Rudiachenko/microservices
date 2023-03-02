FROM java:17-jre-alpine

VOLUME /tmp

LABEL description="API Gateway Zuul module"

COPY target/apigateway-0.1-SNAPSHOT.jar /apigateway-0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "/apigateway-0.1-SNAPSHOT.jar" ]
