package com.plcware.gs.minimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping({"/{id}", "/"})
    private Mono<String> getEmployeeById(@PathVariable(required = false) String id) {
        return Mono.just("Hello, " + (StringUtils.hasText(id) ? id : "World"));
    }
}
