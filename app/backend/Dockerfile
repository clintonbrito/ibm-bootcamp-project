# Etapa de Construção
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build
WORKDIR /app-backend
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests
# RUN mvn clean package

# Etapa Final
FROM maven:3.9.6-eclipse-temurin-17-alpine
WORKDIR /app-backend
# Substituir pelo nome do meu arquivo JAR
COPY --from=build /app-backend/target/ibm-bootcamp-project-0.0.1-SNAPSHOT.jar .
# COPY --from=build /app-backend/wait-for-it.sh .
# RUN chmod +x ./wait-for-it.sh
EXPOSE 8080
VOLUME /app-backend/logs
# Substituir pelo nome do meu arquivo JAR
CMD ["sh", "-c", "sleep 30 && java -jar ibm-bootcamp-project-0.0.1-SNAPSHOT.jar"]
