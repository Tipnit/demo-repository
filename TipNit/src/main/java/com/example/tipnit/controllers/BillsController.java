package com.example.tipnit.controllers;
//import com.example.tipnit.model.parse.Location;
//import com.example.tipnit.model.serializable.SerializableLocation;
//import com.example.tipnit.model.serializable.SerializableBills;
import com.example.tipnit.model.Bills;
import com.example.tipnit.services.LocationService;
import com.example.tipnit.services.BillsService;
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
