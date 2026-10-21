package com.tunein;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController{

    @GetMapping("/health")
    public Map<String,String> checkHealth(){
        return Map.of(
            "status", "UP",
            "application", "TuneIn"
        );
    }
}