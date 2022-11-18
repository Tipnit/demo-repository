


package com.example.shoppingcart;

import com.example.shoppingcart.model.parse.Cart;
import com.example.shoppingcart.model.parse.Order;
import com.example.shoppingcart.model.parse.Product;
import io.github.cdimascio.dotenv.Dotenv;
import org.parse4j.Parse;
import org.parse4j.util.ParseRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCartApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().filename("env").load();
        ParseRegistry.registerSubclass(Product.class);
        ParseRegistry.registerSubclass(Order.class);
        ParseRegistry.registerSubclass(Cart.class);
        Parse.initialize(dotenv.get("PARSE_APP_ID"), dotenv.get("PARSE_REST_ID"));

        SpringApplication.run(ShoppingCartApplication.class, args);
    }

}
