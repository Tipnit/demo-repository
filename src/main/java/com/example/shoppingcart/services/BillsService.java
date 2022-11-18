package com.example.shoppingcart.services;

import com.example.shoppingcart.model.parse.Bills;
import com.example.shoppingcart.model.serializable.SerializableBills;
import org.parse4j.ParseQuery;
import org.parse4j.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class BillsService {
    public ArrayList<Bills> retrieveBills(
            ArrayList<String> category, int limit, String sortOrder
    )
    {
        final ArrayList<Bills> products = new ArrayList<>();
        ParseQuery<Bills> query = ParseQuery.getQuery(Bills.class); // query
        if(category.size( ) > 0)
            query.whereContainsAll("categories", category);
        if(limit > 0)
            query.limit(limit);
        if(sortOrder != null)
        {
            if(sortUserInfo.equals("asc")) query.orderByAscending("createdAT");
            if(sortOrder.equals("des")) query.orderByDescending("createdAT");
        }
        // list where clause
        // sort clause
        try
        {
            List<Bills> list = query.find(); // run query
            for(Bills b: list)
                bills.add(b);
        } catch (ParseException e){
            e.printStackTrace();
        }

        return bills;
    }
    public String addBills(SerializableBills bills)
    {
        String message;
        Product parseProd= new Bills();
        //set the value of each of the fields
        parseProd.setTitle(bills.getCarNote());
        parseProd.setDesc(bills.getRent());
        parseProd.setImg(bills.getUtilities());
        parseProd.setInStock(bills.getLoans());
        parseProd.setPrice(bills.getInsurance());
        parseProd.setCategories(bills.getPetCost());


        try {
            parseBill.save(); //runs the query to (create the bills)insert the new value
            message = "Bills Created"; //set success the return message

        } catch (ParseException e) {
            e.printStackTrace(); //print the error to the console.
            // set the error return message
            message = "Error creating bills. " + e.getMessage();
        }


        return message;
    }
    public String updateBills(String id, Map<String, Object> bills)
    {
        String message;
        String[] strList ={"rent", "utilities", "loans"};
        String[] arrList ={"categories", "color", "size"};

        ParseQuery<Product> query= ParseQuery.getQuery(Product.class);
        try
        {
            Product prod = query.get(id); //retrieves the product by id
            product.forEach(( key, value) -> {
                if(key.equals("price"))
                    prod.put(key, (Double) value);
                else if (key.equals("inStock"))
                    prod.put(key, (boolean) value);
                else if (Arrays.asList(strList).contains(key))
                    prod.put(key, (String) value);
                else if (Arrays.asList(arrList).contains(key))
                    prod.put(key, Arrays.asList(value));

            });
            prod.save();
            message= "Product updated";
        }
        catch(ParseException e){
            e.printStackTrace();
            message= "Error updating product. "+ e.getMessage();
        }

        return message;
    }
    public String removeProduct(String id)
    {
        String message;
        //defines the query for the product class
        ParseQuery<Product> query = ParseQuery.getQuery(Product.class);

        try
        {
            Product product = query.get(id); //get product by id
            product.delete(); //delete product
            message = "Product " + id + " deleted."; //success message
        } catch (ParseException e) {
            e.printStackTrace();
            message = "Error while deleting product. " + e.getMessage(); //error message
        }

        return message;
    }
}
