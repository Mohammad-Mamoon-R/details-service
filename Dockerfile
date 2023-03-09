FROM openjdk:11
EXPOSE 9003
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} details-service.jar
ENTRYPOINT ["java","-jar","/details-service.jar"]