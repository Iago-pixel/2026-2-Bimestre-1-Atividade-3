FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

RUN apt-get update && \
    apt-get install -y wget unzip && \
    wget https://github.com/JetBrains/kotlin/releases/download/v1.9.23/kotlin-compiler-1.9.23.zip && \
    unzip kotlin-compiler-1.9.23.zip -d /opt && \
    rm kotlin-compiler-1.9.23.zip

ENV PATH="/opt/kotlinc/bin:${PATH}"

RUN wget https://repo1.maven.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-core-jvm/1.8.1/kotlinx-coroutines-core-jvm-1.8.1.jar

COPY src/kotlin/consumidor.kt .

RUN kotlinc consumidor.kt \
    -classpath kotlinx-coroutines-core-jvm-1.8.1.jar \
    -include-runtime \
    -d programa.jar

FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /app/programa.jar .
COPY --from=builder /app/kotlinx-coroutines-core-jvm-1.8.1.jar .

CMD ["java", "-cp", "programa.jar:kotlinx-coroutines-core-jvm-1.8.1.jar", "ConsumidorKt"]