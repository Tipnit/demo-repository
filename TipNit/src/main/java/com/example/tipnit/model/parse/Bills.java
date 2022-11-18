package com.example.tipnit.model.parse;

import com.example.tipnit.model.serializable.SerializableBills;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
import java.util.ArrayList;

@ParseClassName("Bills")

public class Bills extends ParseObject {

    public double getRent(){
        return getDouble( "rent");
    }
    public void setRent(double rent){
        put("rent", rent);
    }
    public double getCarNote(){return getDouble( "carNote");
    }
    public void setCarNote(double carNote){
        put("carNote", carNote);
    }
    public double getUtilities(){
        return getDouble( "utilities");
    }
    public void setUtilities(double utilities){
        put("utilities", utilities);
    }
    public double getLoans() { return  getDouble("loans");
    }

    public void setLoans(double loans) {
        put("loans", createJSONArray(loans));
    }

    public double getInsurance() { return  getDouble("insurance");
    }

    public void setInsurance(double insurance) {
        put("insurance", createJSONArray(insurance));
    }

    public double getPetCost() {return  getDouble("petCost");
    }

    public void setPetCost(double petCost) {
        put("petCost", createJSONArray(PetCost));
    }

    public double getPrice() {
        return getDouble("price");
    }

    /*public void setPrice(double price) {
        put("price", price);
    }

    public boolean getInStock() {
        return getBoolean("inStock");
    }

    public void setInStock(boolean inStock) {
        put("inStock", inStock);
    }*/
    private JSONArray createJSONArray(ArrayList<?> arr )
    {
        JSONArray list = new JSONArray();
        for(Object s : arr)
            list.put(s);

        return list;
    }

    public SerializableBills getSerializable()
    {
        return new SerializableBills(
                getObjectId(), getRent(),getCarNote(), getUtilities(),
                getLoans(), getInsurance(), getPetCost()

        );
    }

}
