package com.vikram.RewardsCalc;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class RewardsCalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardsCalcApplication.class, args);
	}

}
