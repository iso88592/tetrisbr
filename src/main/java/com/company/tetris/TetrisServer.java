package com.company.tetris;

import Logic.Round;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TetrisServer {

    List<Player> players = new ArrayList<Player>();

    @RequestMapping(value = "/")
    public String hello() {
        return "hello";
    }
}