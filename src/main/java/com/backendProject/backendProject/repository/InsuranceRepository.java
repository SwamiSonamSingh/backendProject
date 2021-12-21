package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.InsuranceInfo;
import com.backendProject.backendProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends JpaRepository<InsuranceInfo,Long> {

}
