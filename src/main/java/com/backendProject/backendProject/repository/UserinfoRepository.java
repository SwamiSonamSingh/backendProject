package com.backendProject.backendProject.repository;

import com.backendProject.backendProject.model.User;
import com.backendProject.backendProject.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserinfoRepository extends JpaRepository<UserInfo,Long> {

}
