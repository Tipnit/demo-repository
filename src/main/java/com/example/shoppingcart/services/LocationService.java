package com.example.shoppingcart.services;

import com.example.shoppingcart.model.parse.Order;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.ParseQuery;
import org.parse4j.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderService {

    protected final Log logger = LogFactory.getLog(this.getClass());

    public ArrayList<Order> retrieveOrders()
    {
        final ArrayList<Order> orders = new ArrayList<>();

        ParseQuery<Order> query = ParseQuery.getQuery(Order.class);
        try {
            List<Order> list = query.find();
            for (Order o : list) {

                locations.add(o);
            }

        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }

        logger.info(Location.size());
        return locations;
    }
}
