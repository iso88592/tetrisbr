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

    @RequestMapping
    public String tetris(){
        String url=getClass().getClassLoader().getResource("html/tetris.html").getFile();
        StringBuilder result=new StringBuilder();

        try {
            BufferedReader br= new BufferedReader(new FileReader(url));
            String sor;
            while ((sor=br.readLine())!=null){
                result.append(sor);

            }
            return result.toString();
        }
        catch (Exception e){
            e.printStackTrace();
            return "ajjaj";
        }

    }
}