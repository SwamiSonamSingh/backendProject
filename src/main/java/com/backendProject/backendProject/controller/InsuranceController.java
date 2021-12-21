package com.backendProject.backendProject.controller;

import com.backendProject.backendProject.form.InsuranceForm;
import com.backendProject.backendProject.model.InsuranceInfo;
import com.backendProject.backendProject.model.User;
import com.backendProject.backendProject.repository.UserRepository;
import com.backendProject.backendProject.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class InsuranceController {
    @Autowired
    private InsuranceService insuranceService;
    @Autowired
    UserRepository userRepository;
    @PostMapping("/insuranceinfo")
    public InsuranceInfo insuranceInfo(@RequestBody InsuranceForm insuranceForm){
        User user=userRepository.findByMailId(insuranceForm.getMailId());
        InsuranceInfo insuranceInfo=new InsuranceInfo();
        insuranceInfo.setUser(user);
        insuranceInfo.setInsuranceType(insuranceForm.getInsuranceType());
        insuranceInfo.setCauseOfRisk(insuranceForm.getCauseOfRisk());
        insuranceInfo.setPremiumAmmount(insuranceForm.getPremiumAmmount());
        insuranceInfo.setProtectionOption(insuranceForm.getProtectionOption());
        insuranceInfo.setPurchaseValue(insuranceForm.getPurchaseValue());
        insuranceInfo.setProductType(insuranceForm.getProductType());
        insuranceInfo.setPurchaseYear(insuranceForm.getPurchaseYear());
        return insuranceService.save(insuranceInfo);
    }
}
