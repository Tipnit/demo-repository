package com.example.shoppingcart.model.serializable;
import com.example.shoppingcart.model.Bills;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableBills {
    private double rent;
    private double utilities;
    private double loans;
    private double insurance;
    private double petCost;
}

