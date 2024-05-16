package com.vikram.RewardsCalc.Repos;

import com.vikram.RewardsCalc.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}