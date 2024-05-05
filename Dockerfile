FROM openjdk:21

WORKDIR /app

COPY /target/student-app-service.jar /app/

EXPOSE 9292

CMD [ "java", "-jar", "student-app-service.jar" ]