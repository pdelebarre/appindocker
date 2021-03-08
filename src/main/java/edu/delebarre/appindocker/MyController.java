package edu.delebarre.appindocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hi")
    String sayHello() {
        return "Hello!";
    }
}
