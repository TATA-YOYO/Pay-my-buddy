package com.paymybuddy.service;

import com.paymybuddy.modele.UserApp;
import com.paymybuddy.repository.IUserAppRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class UserAppServiceTest {

    @Autowired
    UserAppService userAppService;

    @Autowired
    IUserAppRepository iUserAppRepository;

    @AfterEach
    public void cleaningTask() {
        iUserAppRepository.deleteAll();
    }

    @Test
    public void addUserAppTest() {

        //Act
        UserApp result = userAppService.addUserApp("test01", "addUserAppTest@test01.fr", "123456");

        //Assert
        assertEquals(result.getEmail(), "addUserAppTest@test01.fr");

    }

    @Test
    public void getUserAppByEmailTest() {
        //Arrange
        userAppService.addUserApp("test01", "getUserAppByEmail@test01.fr", "123456");

        //Act
        Optional<UserApp> resultContainer = userAppService.getUserAppByEmail("getUserAppByEmail@test01.fr");
        UserApp result = resultContainer.get();

        //Assert
        assertEquals(result.getEmail(), "getUserAppByEmail@test01.fr");
    }

    @Test
    public void getUserAppTest() {
        //Arrange
        userAppService.addUserApp("test01", "getUserApp@test01.fr", "123456");
        Optional<UserApp> Container = userAppService.getUserAppByEmail("getUserApp@test01.fr");
        int id = Container.get().getId();
        //Act
        Optional<UserApp> resultContainer = userAppService.getUserApp(id);
        UserApp result = resultContainer.get();

        //Assert
        assertEquals(result.getEmail(), "getUserApp@test01.fr");
    }

}
