package com.paymybuddy.service;

import com.paymybuddy.modele.UserApp;
import com.paymybuddy.repository.IUserAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserAppService {

    @Autowired
    IUserAppRepository iUserAppRepository;



    public UserApp addUserApp(String nickname, String email, String passWord) {
        UserApp userApp = new UserApp();
        userApp.setNickname(nickname);
        userApp.setEmail(email);
        userApp.setPassWord(passWord);
        return iUserAppRepository.save(userApp);
    }

    public Optional<UserApp> getUserAppByEmail(String email) {
        return iUserAppRepository.findByEmail(email);
    }

    public Optional<UserApp> getUserApp(int userId) {
        return iUserAppRepository.findById(userId);
    }
}
