package com.example.tipnit.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    String name;
    String email;
    String userName;
    int phoneNumber;
}
