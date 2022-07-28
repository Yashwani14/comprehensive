FROM openjdk:11
ADD target/comprehensive.jar comprehensive.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/comprehensive.jar"]