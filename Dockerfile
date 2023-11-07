# Use the official OpenJDK base image
FROM openjdk:17
ADD target/authentication-system-springboot.jar authentication-system-springboot.jar
ENTRYPOINT ["java", "-jar", "/authentication-system-springboot.jar"]
EXPOSE 8080