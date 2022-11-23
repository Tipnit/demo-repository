package com.example.tipnit.model.serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableLocation {
    private String address;
    private String city;
    private String state;
    private int zip_code;
}
