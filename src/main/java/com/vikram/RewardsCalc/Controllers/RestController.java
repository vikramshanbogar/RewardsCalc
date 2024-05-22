package com.vikram.RewardsCalc.Controllers;

import com.vikram.RewardsCalc.Models.Customer;
import com.vikram.RewardsCalc.Repos.CustomerRepo;
import com.vikram.RewardsCalc.Services.CustomerService;
import com.vikram.RewardsCalc.Utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/customers")
public class RestController {

    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerRepo repo;
    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping
    String insertData(@RequestBody Customer customer) {
        if (customer == null)
            return "Data not inserted successfully";

        customerService.insertData(customer);
        return "Data inserted successfully";
    }

    @PutMapping
    String updateData(@RequestBody Customer customer) {
        if (customer == null) {
            return "Data not inserted successfully";
        }
        //  collageService.insertData(collage);
        if (customer.getId() != null && repo.findById(customer.getId()).isPresent()) {
            customerService.insertData(customer);
            return "Data Updated successfully";
        } else {
            return "Data not inserted successfully, Create before updating";
        }
    }

    @PatchMapping
    String updateDataPatch(@RequestBody Customer customer) {
        Optional<Customer> customerOptional = customerRepo.findById(customer.getId());

        if (!customerOptional.isPresent()) {
            return "Record not found";
        }
        try {
            Utility.CustomerPatcher(customerOptional.get(), customer);
            customerService.insertData(customerOptional.get());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return "Data patched successfully";
    }

    @GetMapping
    List<Customer> getCustomers() {
        return repo.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.HEAD)
    String getRequest() {
        return "Success";
    }

    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable int id) {
        return repo.findById(id).get();
    }

    @RequestMapping(value = "/", method = RequestMethod.OPTIONS)
    ResponseEntity<?> getOptions() {
        return ResponseEntity
                .ok()
                .allow(HttpMethod.GET, HttpMethod.DELETE,HttpMethod.PUT,HttpMethod.POST, HttpMethod.PATCH, HttpMethod.OPTIONS, HttpMethod.HEAD)
                .build();
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