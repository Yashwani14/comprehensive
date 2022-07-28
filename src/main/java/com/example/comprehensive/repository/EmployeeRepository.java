package com.example.comprehensive.repository;

import org.springframework.stereotype.Repository;
import com.example.comprehensive.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	EmployeeRepository findByName(String name);

}
