package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;
import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Iterable<Employee> findAll() {
		productRepository.count();
		
		return productRepository.findAll();
	
		
		
	}
	
	public void save() {
		
		//data.setId();
		//data.setName("wicket");
		//data.setPrice(500);
		//productRepository.save(data);
	}

}
