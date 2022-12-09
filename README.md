# Getting Started

This is a minimal setup to build a dockerized SpringBoot application. Requires *Java 17* because it runs SpringBoot
3.0.0 - it is time to abandon the old good *Java8*

### Docker Build

```
mvn clean install jib:dockerBuild
docker run -p 8080:8080 -t minimal-spring-docker
```

### Try it

#### http://localhost:8080

Response `Hello, World`

#### http://localhost:8080/Java

Response `Hello, Java`


