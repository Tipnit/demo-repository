package com.example.shoppingcart.model.parse;
import com.example.shoppingcart.model.Kids;
import com.example.shoppingcart.model.serializable.SerializableKids;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
import java.util.ArrayList;
@ParseClassName("Kids")
public class Kids extends ParseObject {

    final static String BILLS = "bills";
    public ArrayList<Kids> getBills()
    {
        return (ArrayList<Kids>) get(BILLS);
    }
    public void setBills(ArrayList<Kids> bills)
    {
        JSONArray items = new JSONArray();
        for(Kids k : billss)
            items.put(k.getJSONObject());

        put(BILLS, items);
    }
    public SerializableKids getSerializable() {
        return new SerializableKids(getObjectId(), getBills());
    }
}