package com.example.shoppingcart.model.serializable;
import com.example.shoppingcart.model.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableUserInfo{
    private String name;
    private int phonenumber;
    private String email;
    private String username;
    private String password;
}
