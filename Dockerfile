# Utilise une image JDK 17 officielle
FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copie tout le code
COPY . .

# Installe Maven via le wrapper et construit le projet
RUN bash mvnw clean package -DskipTests

# Expose le port par défaut de Spring Boot
EXPOSE 8080

# Lance l'application
CMD ["java", "-jar", "target/portfolio2025-0.0.1-SNAPSHOT.jar"]
