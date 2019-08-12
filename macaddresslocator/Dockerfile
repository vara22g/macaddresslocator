FROM anapsix/alpine-java
RUN mkdir /app
COPY target/*.jar /app
WORKDIR /app
EXPOSE 8090
ENTRYPOINT java -Dserver.port=8090 -jar *.jar