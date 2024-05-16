package com.vikram.RewardsCalc.Controllers;

import com.vikram.RewardsCalc.Models.Customer;
import com.vikram.RewardsCalc.Repos.CustomerRepo;
import com.vikram.RewardsCalc.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/customers")
public class RestController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerRepo repo;

    @PostMapping
    String insertData(@RequestBody Customer customer) {
        if (customer == null) {
            return "Data not inserted successfully";
        }
        //  collageService.insertData(collage);
        if (repo.findById(customer.getId()).isPresent()) {
            customerService.insertData(customer);
            return "Data Updated successfully";
        } else {
            customerService.insertData(customer);
            return "Data inserted successfully";
        }
    }

    @GetMapping
    List<Customer> getCustomers() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable int id) {
        return repo.findById(id).get();
    }

    @DeleteMapping("/{id}")
    String deleteCustomerById(@PathVariable int id) {
        if (repo.findById(id).isPresent()) {
            repo.deleteById(id);
            return "Customer deleted successfully";
        }
        return "Failed to Delete the customer, Pls check the id";
    }
}