package com.vikram.RewardsCalc.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "f_name")
    String f_name;
    @Column(name = "l_name")
    String l_name;

//    Address address;
}
