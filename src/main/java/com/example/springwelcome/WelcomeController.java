package com.example.springwelcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Change from @RestController to @Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "index"; // This will look for src/main/resources/static/index.html
    }
}

