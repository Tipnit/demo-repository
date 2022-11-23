package com.example.tipnit.services;

import com.example.tipnit.model.parse.Kids;
//import com.example.tipnit.model.serializable.SerializableKidss;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.parse4j.ParseQuery;
import org.parse4j.ParseException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class KidsService {
   protected final Log logger = LogFactory.getLog(this.getClass());

   public ArrayList<Kids> retrieveKids()
   {
       final ArrayList<Kids> kids = new ArrayList<>();

       ParseQuery<Kids> query = ParseQuery.getQuery(Kids.class);
       try {
           List<Kids> list = query.find();
           for (Kids k : list) {
               kids.add(k);
           }

       }
       catch(Exception e)
       {
           logger.error("Error occurred", e);
       }

       return kids;
   }
}
