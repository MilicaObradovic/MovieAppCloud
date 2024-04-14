# Koristite zvanični Docker image za Java
FROM openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
# Postavite radni direktorijum u kontejneru
WORKDIR /app

# Kopirajte JAR fajl vaše aplikacije u kontejner
COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Prosleđivanje konekcione konfiguracije kao environment varijable
ENV DATASOURCE_URL=jdbc:postgresql://database-movies.c342ug4mmfb2.eu-north-1.rds.amazonaws.com:5432/initial_database_movies
ENV DATASOURCE_USERNAME=postgres
ENV DATASOURCE_PASSWORD=postgres

# Pokrenite aplikaciju
ENTRYPOINT ["java", "-jar", "app.jar"]