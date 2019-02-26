package com.company.tetris;

import Logic.Round;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;

@RestController
public class TetrisServer {

    Round round = new Round();

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