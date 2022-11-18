package com.example.shoppingcart.model.parse;
import com.example.shoppingcart.model.Address;
import com.example.shoppingcart.model.CartItem;
import com.example.shoppingcart.model.serializable.SerializableOrder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
import java.util.ArrayList;
@ParseClassName("Location")
public class Location extends ParseObject {

    final static String CITY = "City";
    final static String ADDRESS = "address";
    final static Int ZIPCODE = "zipCode";
    final static String STATES = "state";

    public String getCity() {
        return getString(CITY);
    }
    public void setCity(String city) {
        put(CITY, city);
    }
    public ArrayList<Kids> getBills()
    {
        return (ArrayList<Kids>) get(BILLS);
    }
    public void setBills(ArrayList<Kids> billss)
    {
        JSONArray items = new JSONArray();
        for(Kids c : bills)
            items.put(k.getJSONObject());

        put(Bills, items);
    }

    public Address getAddress()
    {
        Gson gson = new Gson();
        JsonElement jsonElement = gson.toJsonTree(get(ADDRESS));
        return gson.fromJson(jsonElement, Address.class);
    }
    public void setAddress(Address add)
    {
        put(ADDRESS, add);
    }

    public String getState()
    {
        return getString(STATE);
    }

    public void setStatus(String state)
    {
        put(STATE, state);
    }


    public SerializableLocation getSerializable() {
        return new SerializableLocation(getObjectId(), getAddress(), getCity(), getZipCode(), getState());
    }
}
