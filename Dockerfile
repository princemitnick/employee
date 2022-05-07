FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
ARG JAR_FILE
COPY target/employee-0.1.jar /
EXPOSE 9292
ENTRYPOINT [ "java", "-jar", "/employee-v1.jar" ]