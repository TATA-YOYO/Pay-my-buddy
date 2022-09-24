package com.paymybuddy.service;

import com.paymybuddy.modele.UserApp;
import com.paymybuddy.repository.IUserAppRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserAppServiceTest {


    UserAppService userAppService = new UserAppService();

    @Mock
    IUserAppRepository iUserAppRepository;

    @BeforeEach
    public void setup() {
        userAppService.iUserAppRepository = iUserAppRepository;
    }

    @Test
    public void addUserAppTest() {
        //Arrange
        when(iUserAppRepository.save(any(UserApp.class))).thenReturn(any(UserApp.class));

        //Act
        UserApp result = userAppService.addUserApp("test01", "addUserAppTest@test01.fr", "123456");

        //Assert
        verify(iUserAppRepository, Mockito.times(1)).save(any(UserApp.class));
    }

    @Test
    public void getUserAppByEmailTest() {
        //Arrange
        when(iUserAppRepository.findByEmail(any(String.class))).thenReturn(null);

        //Act
        Optional<UserApp> resultContainer = userAppService.getUserAppByEmail("getUserAppByEmail@test01.fr");

        //Assert
        verify(iUserAppRepository, Mockito.times(1)).findByEmail(any(String.class));
    }

    @Test
    public void getUserAppTest() {
        //Arrange
        when(iUserAppRepository.findById(any(Integer.class))).thenReturn(null);

        //Act
        Optional<UserApp> resultContainer = userAppService.getUserApp(12354);

        //Assert
        verify(iUserAppRepository, Mockito.times(1)).findById(any());
    }

}
