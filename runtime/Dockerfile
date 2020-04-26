FROM openjdk:7

RUN mkdir -p /tmp/app
RUN chmod 775 /tmp/app
#WORKDIR F:/pratik/code/springboot/demo-web-application/runtime

RUN mvn clean install

COPY demo-web-application-1.0-SNAPSHOT.jar /tmp/app/


EXPOSE 8001

RUN pwd
RUN ls
RUN cd /tmp/app
RUN pwd
RUN ls

CMD ["-jar /tmp/app/demo-web-application-1.0-SNAPSHOT.jar"]
