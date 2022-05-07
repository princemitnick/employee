FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
ARG JAR_FILE
COPY target/*.jar /tmp/empooyee-v1.jar
EXPOSE 9091
ENTRYPOINT [ "java", "-jar", "/tmp/employee-v1.jar" ]