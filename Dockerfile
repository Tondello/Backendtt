FROM amazoncorretto:11-alpine-jdk
MAINTAINER MAURIANDER Tomas
EXPOSE 8080 
COPY  target/tomas-0.0.1-SNAPSHOT.jar tomas-app.jar
ENTRYPOINT ["java","-jar","/tomas-app.jar"] 
