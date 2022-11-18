

package com.example.shoppingcart;

import com.example.shoppingcart.model.parse.Bills;
import com.example.shoppingcart.model.parse.Location;
import com.example.shoppingcart.model.parse.CarNote;
import com.example.shoppingcart.model.parse.UserInfo
import com.example.shoppingcart.model.parse.Kids;;
import io.github.cdimascio.dotenv.Dotenv;
import org.parse4j.Parse;
import org.parse4j.util.ParseRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TipnitApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().filename("env").load();
        ParseRegistry.registerSubclass(Bills.class);
        ParseRegistry.registerSubclass(Location.class);
        ParseRegistry.registerSubclass(CarNote.class);
        ParseRegistry.registerSubclass(Kids.class);
        ParseRegistry.registerSubclass(UserInfo.class);
        Parse.initialize(dotenv.get("PARSE_APP_ID"), dotenv.get("PARSE_REST_ID"));

        SpringApplication.run(TipnitApplication.class, args);
    }

}