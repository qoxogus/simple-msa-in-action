FROM openjdk:21-jdk
LABEL maintainer="baetaehyeon"
ARG JAR_FILE=build/libs/*.jar
ARG ARG_PROFILE
ENV PROFILE = ${ARG_PROFILE}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=${PROFILE}","/app.jar"]