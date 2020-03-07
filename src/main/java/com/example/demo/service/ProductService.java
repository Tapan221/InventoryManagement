package com.example.demo.service;

import com.example.demo.entities.Employee;

public interface ProductService {
	public Iterable<Employee> findAll();
	public void save();

}
