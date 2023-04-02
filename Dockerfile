FROM openjdk:17

WORKDIR /opt/app

COPY ./build/libs/* ./app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
