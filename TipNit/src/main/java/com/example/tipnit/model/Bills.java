package com.example.tipnit.model;

//import com.example.tipnit.model.parse.Bills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import org.json.JSONObject;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bills {

    private double carNote;
    private double rent;
    private double utilities;
    private double insurance;
    private double loans;
    private double petCost;


    /*public JSONObject getJSONObject(){
        JSONObject obj = new JSONObject();
        obj.append("rent", rent);
        obj.append("utilities", utilities);
        obj.append("carNote", carNote);
        obj.append("petCost", petCost);
        obj.append("loans", loans);
        return obj;
    }*/
}

