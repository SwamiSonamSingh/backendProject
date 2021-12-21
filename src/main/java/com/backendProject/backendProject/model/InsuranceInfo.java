package com.backendProject.backendProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String insuranceType;
    private String protectionOption;
    private String productType;
    private String causeOfRisk;
    private String purchaseYear;
    private String purchaseValue;
    private String premiumAmmount;
    @ManyToOne
    @JoinColumn(name="user_id",referencedColumnName = "mailId")
    private User user;
}
