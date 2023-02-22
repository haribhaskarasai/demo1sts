package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stg.entity.Department;
import com.stg.entity.Employee;
import com.stg.repository.DepartmentRepository;
import com.stg.repository.EmployeeRepository;

@RestController
@RequestMapping(value="dept")
public class DepartmentController {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	@PostMapping(value="add",consumes= MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
	public Department addDepartment( @RequestBody Department department) {
		return  departmentRepository.save(department) ;
		
	}
	@PostMapping(value="addemp",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmplyee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}

}
