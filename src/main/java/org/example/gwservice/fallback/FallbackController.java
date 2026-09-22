package org.example.gwservice.fallback;

import org.example.javaframework.web.api.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/auth")
    public Response<String> handleAuthFallback() {
        return Response.failure(HttpStatus.SERVICE_UNAVAILABLE.toString(),"Auth service is currently unavailable");
    }

    @GetMapping("/user")
    public Response<String> handleUserFallback() {
        return Response.failure(HttpStatus.SERVICE_UNAVAILABLE.toString(),"User service is currently unavailable");
    }

    @GetMapping("/lab")
    public Response<String> handleLabFallback() {
        return Response.failure(HttpStatus.SERVICE_UNAVAILABLE.toString(),"Lab service is currently unavailable");
    }
}
