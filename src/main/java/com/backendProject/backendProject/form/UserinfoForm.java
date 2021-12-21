package com.backendProject.backendProject.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserinfoForm {
    private Long id;
    private String firstName;
    private String lastName;
    private String mailId;
    private String mobileNo;
    private String marriesStatus;
    private String address;
    private String city;
    private String state;
    private String pincode;
}
