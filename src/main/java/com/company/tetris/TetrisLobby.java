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
        int lobbyId = 1;
        Cookie cookie = new Cookie("lobby", String.valueOf(lobbyId));
        cookie.setMaxAge(60*10);
        int playerId = 1;
        cookie = new Cookie("playerid", String.valueOf(playerId));
        response.addCookie(cookie);
        return new RedirectView("/lobby");
    }

    @RequestMapping("/lobby")
    public String lobby(@CookieValue String lobby, @CookieValue String playerId) {  //TODO: Count connecting players (can't until that part of backend is done)
        return "";
    }


}
