package com.example.comprehensive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comprehensive.entity.Employee;
import com.example.comprehensive.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public List<Employee> saveEmployee(List<Employee>employees){
		return employeeRepository.saveAll(employees);
	}
	
	public List<Employee>getEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "employee is deleted"+id;
	}
	public Employee updateEmployee(Employee em) {
		Employee ep=employeeRepository.findById(em.getId()).orElse(null);
		ep.setName(em.getName());
		ep.setSalary(em.getSalary());
		ep.setDesignation(em.getDesignation());
		return employeeRepository.save(ep);
	}
	

}
