# Etapa de Construção
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app-backend
COPY pom.xml .
COPY src ./src
RUN mvn clean install

# Etapa Final
FROM maven:3.9.6-eclipse-temurin-17-alpine
WORKDIR /app-backend
# Substituir pelo nome do meu arquivo JAR
COPY --from=build /app-backend/target/nome-do-meu-arquivo.jar .
EXPOSE 8080
VOLUME /app-backend/logs
# Substituir pelo nome do meu arquivo JAR
CMD ["java", "-jar", "nome-do-meu-arquivo.jar"]
