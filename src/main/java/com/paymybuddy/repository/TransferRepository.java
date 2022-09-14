package com.paymybuddy.repository;

import com.paymybuddy.modele.Transfer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferRepository extends CrudRepository<Transfer,Integer> {
}
