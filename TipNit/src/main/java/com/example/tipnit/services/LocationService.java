package com.example.tipnit.services;

import com.example.tipnit.model.parse.Location;
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

        ParseQuery<Location> query = ParseQuery.getQuery(Location.class);
        try {
            List<Location> list = query.find();
            for (Location l : list) {

                location.add(l);
            }

        }
        catch(Exception e)
        {
            logger.error("Error occurred", e);
        }

        logger.info(location);
        return location;
    }
}
