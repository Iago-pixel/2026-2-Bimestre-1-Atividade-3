FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

RUN apt-get update && \
    apt-get install -y wget unzip && \
    wget https://github.com/JetBrains/kotlin/releases/download/v1.9.23/kotlin-compiler-1.9.23.zip && \
    unzip kotlin-compiler-1.9.23.zip -d /opt && \
    rm kotlin-compiler-1.9.23.zip

ENV PATH="/opt/kotlinc/bin:${PATH}"

COPY src/kotlin/sequencial.kt .

RUN kotlinc sequencial.kt -include-runtime -d programa.jar

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /app/programa.jar .

CMD ["java", "-jar", "programa.jar"]