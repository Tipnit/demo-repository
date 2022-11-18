package com.example.shoppingcart.model;

import com.example.shoppingcart.model.parse.Bills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bills {
    private Rent Rent;
    private double carNote;
    private double utilities;
    private double insurance;
    private double loans;
    private double petCost;


    public JSONObject getJSONObject(){
        JSONObject obj = new JSONObject();
        obj.append("rent", product.getSerializable());
        obj.append("utilities", utilities);
        obj.append("carNote", carNote);
        obj.append("petCost", petCost);
        obj.append("loans", loans);
        return obj;
    }
}

