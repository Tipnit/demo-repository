package com.example.tipnit.model.serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableBills {
    private double rent;
    private double utilities;
    private double loans;
    private double insurance;
    private double petCost;
    private double CarNote;
}

