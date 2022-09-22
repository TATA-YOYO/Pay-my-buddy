package com.paymybuddy.repository;

import com.paymybuddy.modele.BankAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBankAccountRepository extends CrudRepository<BankAccount,Integer> {
}
