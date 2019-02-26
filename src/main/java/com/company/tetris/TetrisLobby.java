package com.company.tetris;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class TetrisLobby {
    @RequestMapping("/play")
    public RedirectView play(HttpServletResponse response) {
        int lobbyId = 1; // lobby azonosítója
        Cookie cookie = new Cookie("lobby", String.valueOf(lobbyId)); // süti létrehozása lobby néven
        cookie.setMaxAge(60*10); // 10 percre beállítani a süti lejárási idejét
        int playerId = 1; // játékos azonosítója
        cookie = new Cookie("playerid", String.valueOf(playerId)); // süti létrehozása playerid néven
        response.addCookie(cookie); // a süti hozzáadása a localhost:8080/play-hez
        return new RedirectView("/lobby"); // localhost:8080/lobby megjelenítése
    }

    @RequestMapping("/lobby")
    public String lobby(@CookieValue String lobby, @CookieValue String playerId) {  //TODO: Count connecting players (can't until that part of backend is done)
        return "";
    }


}