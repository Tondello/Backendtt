FROM amazoncorretto:11-alpine-jdk
MAINTAINER Tomas
COPY  target/tomas-0.0.1-SNAPSHOT.jar tomas-app.jar
ENTRYPOINT ["java","-jar","/tomas-app.jar"] 
