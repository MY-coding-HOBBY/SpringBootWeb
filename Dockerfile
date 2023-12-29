FROM maven:3.9.4-amazoncorretto-20-al2023

WORKDIR /usr/src/app

COPY . /usr/src/app

RUN mvn clean package

ENV PORT 5000
EXPOSE $PORT
CMD [ "java", "-jar", "./target/SpringBootWeb.jar" ]
