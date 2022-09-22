package com.paymybuddy.repository;

import com.paymybuddy.modele.Deposit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepositRepository extends CrudRepository<Deposit,Integer> {
}
