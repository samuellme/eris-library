FROM openjdk:17-jdk-alpine
WORKDIR /home

COPY ./target/app.jar .

ENTRYPOINT ["java","-jar","/home/app.jar"]