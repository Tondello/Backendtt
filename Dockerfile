EXPOSE 8080
FROM amazoncorretto:11-alpine-jdk
MAINTAINER MAURIANDER Tomas 
COPY  target/tomas-0.0.1-SNAPSHOT.jar tomas-app.jar
EXPOSE 8080  
ENTRYPOINT ["java","-jar","/tomas-app.jar"] 
