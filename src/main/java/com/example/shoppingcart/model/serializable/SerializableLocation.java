package com.example.shoppingcart.model.serializable;
import com.example.shoppingcart.model.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableLocation {
    private @Nullable Address address;
    private String city;
    private String state;
    private int zip_code;
}
