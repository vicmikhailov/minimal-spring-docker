FROM openjdk:17-alpine3.14
VOLUME /tmp

#ARG DEPENDENCY=target/dependency
#COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
#COPY ${DEPENDENCY}/META-INF /app/META-INF
#COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8080

ENTRYPOINT ["java","-cp","app:app/lib/*","com.plcware.gs.minimal.Application"]
