# instalar uma img do jdk
FROM openjdk:21

# pasta para arquivos do projeto
WORKDIR /app

# copia os arquivos do projeto
COPY . /app

# faz o deploy 
RUN ./mvnw -B clean package -DskipTests

# porta de execucao
EXPOSE 8081

# script para execucao
CMD ["java", "-jar", "target/apiPedidos-0.0.1-SNAPSHOT.jar"]