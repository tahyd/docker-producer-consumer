FROM openjdk:17
COPY ./target/producer.jar producer.jar
EXPOSE 9090
ENTRYPOINT [ "java","-jar","producer.jar" ]