package com.backendProject.backendProject.service;

import com.backendProject.backendProject.model.InsuranceInfo;
import com.backendProject.backendProject.repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {
    @Autowired
    private InsuranceRepository insuranceRepository;
    public InsuranceInfo save(InsuranceInfo insuranceInfo){
        return insuranceRepository.save(insuranceInfo);
    }
}
