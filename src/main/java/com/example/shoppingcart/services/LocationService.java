package com.example.shoppingcart.services;

import com.example.shoppingcart.model.parse.Location;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.ParseQuery;
import org.parse4j.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LocationService {

    protected final Log logger = LogFactory.getLog(this.getClass());

    public ArrayList<Location> retrieveLocation()
    {
        final ArrayList<Location> location = new ArrayList<>();

        ParseQuery<Order> query = ParseQuery.getQuery(Location.class);
        try {
            List<Location> list = query.find();
            for (Location l : list) {

                locations.add(l);
            }

        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }

        logger.info(Location.address());
        return locations;
    }
}
