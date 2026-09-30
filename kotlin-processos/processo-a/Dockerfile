FROM eclipse-temurin:17-jdk

WORKDIR /app

RUN apt-get update && \
    apt-get install -y wget unzip && \
    wget https://github.com/JetBrains/kotlin/releases/download/v1.9.23/kotlin-compiler-1.9.23.zip && \
    unzip kotlin-compiler-1.9.23.zip -d /opt && \
    rm kotlin-compiler-1.9.23.zip

ENV PATH="/opt/kotlinc/bin:${PATH}"

COPY Main.kt .

RUN kotlinc Main.kt -include-runtime -d Main.jar

CMD ["java", "-jar", "Main.jar"]