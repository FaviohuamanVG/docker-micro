# Etapa de build
FROM eclipse-temurin:17-alpine as build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Etapa final (sin root, opcional)
FROM eclipse-temurin:17-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8085
CMD ["java", "-jar", "app.jar"]
