package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository("CrudRepository")
public interface ProductRepository extends CrudRepository<Employee, Integer>{

}
