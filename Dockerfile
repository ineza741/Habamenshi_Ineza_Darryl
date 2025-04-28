FROM openjdk:25-jdk
RUN mkdir /app
COPY out/production/Assignment/ .
WORKDIR /tmp
CMD ["java", "RwandaPolice"]
