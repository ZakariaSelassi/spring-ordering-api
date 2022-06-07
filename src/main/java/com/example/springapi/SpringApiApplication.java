package com.example.springapi;

import com.example.springapi.model.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	MenuRepository menuRepository;
	@Autowired
	IngredientsRepository ingredientsRepository;
	@Autowired
	StockRepository stockRepository;
	@Autowired
	OrdersRepository ordersRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
