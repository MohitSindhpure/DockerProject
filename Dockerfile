FROM openjdk:17
EXPOSE 8080
ADD target/DockerProject.jar DockerProject.jar
ENTRYPOINT ["java","-jar","/DockerProject.jar"]