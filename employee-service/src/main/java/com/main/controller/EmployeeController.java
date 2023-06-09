package com.main.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.EmployeeDto;
import com.main.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/employees")
@AllArgsConstructor
public class EmployeeController {

	private EmployeeService employeeService;

	// Build Save Employee REST API
	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
		return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
	}

	// Build Get Employee REST API
	@GetMapping("{id}")
	public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long employeeId) {
		EmployeeDto empDto = employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<>(empDto, HttpStatus.OK);
	}
}