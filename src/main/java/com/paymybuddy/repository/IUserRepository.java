package com.paymybuddy.repository;

import com.paymybuddy.modele.UserApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<UserApp, Integer> {
}
