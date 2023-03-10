## Work with Dockerfile
To start application:
1. start docker-compose.yml, which in the root-project.
2. start DockerFile of the discovery module.

To check the result go to the http://localhost:8761/

Urls:
#checking
#eureka
http://localhost:8761/

#common
http://localhost:8077/eurekaPort
http://localhost:8077/onePort
http://localhost:8077/twoPort
http://localhost:8077/twoApiPort
http://localhost:8077/eurekaZone

#one
http://localhost:8081/test
http://localhost:8081/count

#two
http://localhost:8082/redirect
http://localhost:8082/test
http://localhost:8082/timer
http://localhost:8082/two/55

#two-api
http://localhost:8083/test

#apigateway
http://localhost:8080/test
http://localhost:8080/epam

```shell script
#docker compose build
docker-compose build
#docker-compose rub
docker-compose up

# Create an image by Dockerfile from project root directory
docker build -f platform-service\discovery\Dockerfile platform-service\discovery -t discovery
docker build -f platform-service\apigateway\Dockerfile platform-service\apigateway -t apigateway
docker build -f business-service\one\Dockerfile business-service\one -t one
docker build -f business-service\two\Dockerfile business-service\two -t two
docker build -f business-service\common\Dockerfile business-service\common -t common
docker build -f business-service\feign-api\Dockerfile business-service\two-api -t two-api

# Run Docker container 
docker run -p 8761:8761 -d discovery
docker run -p 8080:8080 -d apigateway
docker run -p 8077:8077 -d common
docker run -p 8081:8081 -d one
docker run -p 8082:8082 -d two
docker run -p 8083:8083 -d two-api

# Watch logs
docker logs ec-app

# Inspect a container
docker inspect ec-app

```