package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.Product;
import com.example.demo.service.ProductService;

@SpringBootApplication
public class CrudSpringBootSqLiteApplication implements CommandLineRunner{
	
	@Autowired
	private ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootSqLiteApplication.class, args);
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		
		productService.findAll();
		/*
		 * for (Product product: productService.findAll()) {
		 * System.out.println(product.getId()); System.out.println(product.getName());
		 * System.out.println(product.getPrice()); }
		 */
		 
		
		productService.save();
		System.out.println("Saved to DB Successfully");
		
	}

}