# Используем официальный образ OpenJDK для Java 17
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем JAR-файл в контейнер
COPY target/test_task-1.0-SNAPSHOT.jar /app/app.jar

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

