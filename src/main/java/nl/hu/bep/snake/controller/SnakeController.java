package nl.hu.bep.snake.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restservices/bepslang")
public class SnakeController {

    @GetMapping
    public String getSnakeInfo() {
        // Implement info about the snake
        return "Hello World";
    }

}
