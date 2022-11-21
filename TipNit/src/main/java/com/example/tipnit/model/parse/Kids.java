package com.example.tipnit.model.parse;
import com.example.tipnit.model.serializable.SerializableKids;
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
        for(Kids k : bills)
            items.put(k.getJSONObject());

        put(BILLS, items);
    }
    public SerializableKids getSerializable() {
        return new SerializableKids(getObjectId(), getBills());
    }
}