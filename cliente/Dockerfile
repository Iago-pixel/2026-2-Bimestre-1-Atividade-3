FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

RUN apt-get update && apt-get install -y wget unzip \
    && rm -rf /var/lib/apt/lists/*

RUN wget -q https://github.com/JetBrains/kotlin/releases/download/v1.9.23/kotlin-compiler-1.9.23.zip \
    && unzip -q kotlin-compiler-1.9.23.zip \
    && rm kotlin-compiler-1.9.23.zip

ENV PATH="/app/kotlinc/bin:${PATH}"

COPY cliente_basico.kt .

RUN kotlinc cliente_basico.kt -include-runtime -d cliente.jar

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /app/cliente.jar .

CMD ["java", "-jar", "cliente.jar"]