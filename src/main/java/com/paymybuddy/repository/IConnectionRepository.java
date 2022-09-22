package com.paymybuddy.repository;

import com.paymybuddy.modele.Connection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConnectionRepository extends CrudRepository<Connection, Integer> {
}
