package com.example.shoppingcart.controllers;
import com.example.shoppingcart.model.parse.Location;
import com.example.shoppingcart.model.serializable.SerializableLocation;
import com.example.shoppingcart.model.serializable.SerializableBills;
import com.example.shoppingcart.services.LocationService;
import com.example.shoppingcart.services.BillsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/cart")
public class BillsController {
    private BillsService billsService;

    public BillsController(BillsService billsService) {
        this.billsService = billsService;
    }

    @GetMapping("/")
    public ArrayList<Bills> getBills()
    {
        ArrayList<Bills> bill = new ArrayList<>();
        ArrayList<User> user = billsService.retrieveBills();

        for(Bills b : user)
            list.add(c.getUser());

        return bill;
    }
}
