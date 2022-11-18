package com.example.tipnit.model.serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SerializableUserInfo{
    private String name;
    private int phoneNumber;
    private String email;
    private String username;
    private String password;
}
