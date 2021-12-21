package com.backendProject.backendProject.form;

import com.backendProject.backendProject.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsuranceForm {
    private String insuranceType;
    private String protectionOption;
    private String productType;
    private String causeOfRisk;
    private String purchaseYear;
    private String purchaseValue;
    private String premiumAmmount;
    private String mailId;
}

