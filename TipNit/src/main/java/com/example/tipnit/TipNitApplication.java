package com.example.tipnit;

import com.example.tipnit.model.parse.Bills;
import com.example.tipnit.model.parse.Kids;
import com.example.tipnit.model.parse.Location;
import com.example.tipnit.model.parse.UserInfo;
import io.github.cdimascio.dotenv.Dotenv;
import org.parse4j.Parse;
import org.parse4j.util.ParseRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TipNitApplication {

    public static void main(String[] args)

    {
        Dotenv dotenv = Dotenv.configure().filename("env").load();
        ParseRegistry.registerSubclass(Bills.class);
        ParseRegistry.registerSubclass(Location.class);
        ParseRegistry.registerSubclass(Kids.class);
        ParseRegistry.registerSubclass(UserInfo.class);
        Parse.initialize(dotenv.get("PARSE_APP_ID"), dotenv.get("PARSE_REST_ID"));


        SpringApplication.run(TipNitApplication.class, args);
    }

}
