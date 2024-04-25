package com.blockchain.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlockchainBackedAuthenticationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockchainBackedAuthenticationSystemApplication.class, args);
		System.out.println("Authentication System Application started");
	}

}
