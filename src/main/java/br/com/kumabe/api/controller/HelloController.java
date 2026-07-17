package br.com.kumabe.api.controller;

import br.com.kumabe.api.dto.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<HelloResponse> sayHello() {
        // Utilizing the Record to automatically generate a JSON response
        HelloResponse response = new HelloResponse("Hello from Java 21 and Spring Boot 3!", "UP");
        return ResponseEntity.ok(response);
    }
}