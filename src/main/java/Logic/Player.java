package Logic;

import javax.servlet.http.Cookie;

public class Player {
    int id;
    String name;
    int score;
    Cookie cookie;

    public Player(String name, Cookie cookie){
        name=this.name;
        cookie=this.cookie;
    }

}
