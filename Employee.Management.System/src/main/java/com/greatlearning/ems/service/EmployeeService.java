package com.greatlearning.ems.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.greatlearning.ems.model.Employee;

public interface EmployeeService {

	ResponseEntity<String> saveNewEmp(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmpById(int id);

	ResponseEntity<Employee> updateEmp(Employee employee);

	ResponseEntity<String> deleteEmpById(int id);

	List<Employee> getEmpByQuery(String query);

	List<Employee> sortByOrder(String order);

}
