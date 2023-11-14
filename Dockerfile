FROM openjdk:17

EXPOSE 8088

ARG JAR_FILE=target/*.jar

ADD ${JAR_FILE} exercise.jar

ENTRYPOINT ["java","-jar","/exercise.jar"]