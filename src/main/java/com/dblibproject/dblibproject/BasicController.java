package com.dblibproject.dblibproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.*;

@RestController
public class BasicController {

    @GetMapping("/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
