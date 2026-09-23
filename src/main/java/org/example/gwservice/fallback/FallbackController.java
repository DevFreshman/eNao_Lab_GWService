package org.example.gwservice.fallback;

import org.example.javaframework.web.api.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @RequestMapping("/auth")
    public ResponseEntity<Response<String>> handleAuthFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Response.failure(HttpStatus.SERVICE_UNAVAILABLE.toString(), "Auth service is currently unavailable"));
    }

    @RequestMapping("/user")
    public ResponseEntity<Response<String>> handleUserFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Response.failure(HttpStatus.SERVICE_UNAVAILABLE.toString(), "User service is currently unavailable"));
    }

    @RequestMapping("/lab")
    public ResponseEntity<Response<String>> handleLabFallback() {
        return ResponseEntity
                .status(HttpStatus.SERVICE_UNAVAILABLE)
                .body(Response.failure(HttpStatus.SERVICE_UNAVAILABLE.toString(), "Lab service is currently unavailable"));
    }
}