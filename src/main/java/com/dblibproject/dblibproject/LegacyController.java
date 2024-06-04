package com.dblibproject.dblibproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LegacyController {

    @GetMapping("/legacy")
    public String getLegacyCode() {
        return "This is just old code";
    }
}
