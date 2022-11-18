package com.example.shoppingcart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    String city;
    String country;
    String address;
    //String line2;
    String zipCode;
    String state;
}