package com.company.tetris;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TetrisServer {
    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }
}