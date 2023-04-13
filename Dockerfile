FROM openjdk:8
EXPOSE 8080
ADD target/DockerProject.jar DockerProject.jar
ENTRYPOINT ["java","-jar","/DockerProject.jar"]