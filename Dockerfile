FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
ARG JAR_FILE
COPY target/*.jar empooyee-v1.jar
EXPOSE 9091
ENTRYPOINT [ "java", "-jar", "employee-v1.jar" ]