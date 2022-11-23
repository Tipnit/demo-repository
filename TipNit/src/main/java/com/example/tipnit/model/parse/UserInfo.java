package com.example.tipnit.model.parse;
import com.example.tipnit.model.serializable.SerializableUserInfo;
//import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;

@ParseClassName("UserInfo")
public class UserInfo extends ParseObject {

    /*final static String PRODUCTS = "products";
    public ArrayList<UserInfo> getBills()
    {
        return (ArrayList<UserInfo>) get(BILLS);
    }
    public void setProducts(ArrayList<UserInfo> bills)
    {
        JSONArray items = new JSONArray();
        for(CartItem c : products)
            items.put(c.getJSONObject());

        put(PRODUCTS, items);
    }*/
    public SerializableUserInfo getSerializable() {
        return new SerializableUserInfo(getName, getUserName(), getEmail(), getPhoneNumber());
    }
}