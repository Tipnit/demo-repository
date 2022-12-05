package com.example.table.services;

import com.example.table.models.parse.Budget;
import org.parse4j.ParseException;

public class BudgetService {
    public String addBudget(SeriaizableBudget budget){
        String message;

        com.example.table.models.parse.Budget parseBudget = new Budget(); //Parse User Object

        //set the value of each of the fields
        parseBudget.setDescription(Budget.getDescription());
        parseBudget.setType(Budget.getType());
        parseBudget.setAmount(Budget.getAmount());

        try {
            parseBudget.save(); //runs the query to insert the new value
            message = "Budget Added."; //sets the success return message

        } catch (ParseException e) {
            e.printStackTrace(); //print the error to the console
            message = "Error adding Budget." + e.getMessage(); //sets the error return message
        }
        return message;
    }
}
