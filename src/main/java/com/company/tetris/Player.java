package com.company.tetris;

import Logic.Round;

import javax.servlet.http.Cookie;

public class Player {
    int id;
    String name;
    int score;
    Cookie cookie;
    Round round;

    public Player(String name, Cookie cookie){
        name=this.name;
        cookie=this.cookie;
        round = new Round();
    }

}
