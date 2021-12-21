package com.backendProject.backendProject.service;

import com.backendProject.backendProject.model.UserInfo;
import com.backendProject.backendProject.repository.UserinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoService {
@Autowired
    private UserinfoRepository userinfoRepository;
    public UserInfo save(UserInfo userInfo){
        return userinfoRepository.save(userInfo);
    }
}
