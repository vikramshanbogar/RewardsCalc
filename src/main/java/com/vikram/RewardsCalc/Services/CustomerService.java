package com.vikram.RewardsCalc.Services;

import com.vikram.RewardsCalc.Models.Customer;
import com.vikram.RewardsCalc.Repos.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo repo;

    public void insertData(Customer customer) {
        Customer c = repo.save(customer);
    }
}