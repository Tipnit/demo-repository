package com.example.shoppingcart.model.parse;
import com.example.shoppingcart.model.UserInfo;
import com.example.shoppingcart.model.serializable.SerializableUserInfo;
import org.json.JSONArray;
import org.parse4j.ParseClassName;
import org.parse4j.ParseObject;
import java.util.ArrayList;
@ParseClassName("UserInfo")
public class UserInfo extends ParseObject {

    final static String PRODUCTS = "products";
    public ArrayList<CartItem> getProducts()
    {
        return (ArrayList<CartItem>) get(PRODUCTS);
    }
    public void setProducts(ArrayList<CartItem> products)
    {
        JSONArray items = new JSONArray();
        for(CartItem c : products)
            items.put(c.getJSONObject());

        put(PRODUCTS, items);
    }
    public SerializableCart getSerializable() {
        return new SerializableCart(getObjectId(), getProducts());
    }
}