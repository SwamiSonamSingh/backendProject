package com.backendProject.backendProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue
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
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "mailId")
    private User user;
}
