# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Maven al contenedor
COPY target/msMiddleware-0.0.1-SNAPSHOT.jar app.jar

# Copiar el archivo de configuración al contenedor
COPY src/main/resources/application.properties application.properties

# Exponer el puerto en el que se ejecutará la aplicación
EXPOSE 8081

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar", "--spring.config.location=application.properties"]