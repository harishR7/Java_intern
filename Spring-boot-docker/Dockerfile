FROM java:8
ARG JAR_FILE=target/student-service.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]