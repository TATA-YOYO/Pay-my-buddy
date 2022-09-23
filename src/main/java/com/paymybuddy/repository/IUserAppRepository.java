package com.paymybuddy.repository;

import com.paymybuddy.modele.UserApp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserAppRepository extends CrudRepository<UserApp, Integer> {
    Optional<UserApp> findByEmail(String email);
}
