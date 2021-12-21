package com.backendProject.backendProject.controller;

import com.backendProject.backendProject.form.UserinfoForm;
import com.backendProject.backendProject.model.User;
import com.backendProject.backendProject.model.UserInfo;
import com.backendProject.backendProject.repository.UserRepository;
import com.backendProject.backendProject.repository.UserinfoRepository;
import com.backendProject.backendProject.service.UserService;
import com.backendProject.backendProject.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserinfoController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserinfoService userinfoService;
    @Autowired
    UserinfoRepository userinfoRepository;
    @PostMapping("/userinfo")
    public UserInfo userinfo(@RequestBody UserinfoForm userinfoForm){
        User user=userRepository.findByMailId(userinfoForm.getMailId());
        UserInfo userinfo=new UserInfo();
        userinfo.setUser(user);
        userinfo.setAddress(userinfoForm.getAddress());
        userinfo.setCity(userinfoForm.getCity());
        userinfo.setFirstName(userinfoForm.getFirstName());
        userinfo.setLastName(userinfoForm.getLastName());
        userinfo.setMailId(userinfoForm.getMailId());
        userinfo.setMarriesStatus(userinfoForm.getMarriesStatus());
        userinfo.setState(userinfoForm.getState());
        userinfo.setMobileNo(userinfoForm.getMobileNo());
        userinfo.setPincode(userinfoForm.getPincode());
        return userinfoService.save(userinfo);
    }
}
