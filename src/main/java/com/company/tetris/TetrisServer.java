package com.company.tetris;

import Logic.Round;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TetrisServer {

    Round round = new Round();

    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }
}
