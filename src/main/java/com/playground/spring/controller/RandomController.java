package com.playground.spring.controller;

import com.playground.spring.dto.GetRandomResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RequestMapping("/random")
@RestController
public class RandomController {

    private Random random = new Random();

    @GetMapping(produces = "application/json")
    public GetRandomResponse getRandom() {
        return new GetRandomResponse(random.nextInt());
    }

}
