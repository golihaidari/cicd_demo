FROM eclipse-temurin:21-jdk
COPY App.java /app/
WORKDIR /app
RUN javac App.java
CMD ["java", "-cp", ".", "App"]