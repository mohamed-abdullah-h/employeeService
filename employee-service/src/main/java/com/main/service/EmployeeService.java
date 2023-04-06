package com.main.service;

import com.main.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	EmployeeDto getEmployeeById(Long employeeId);
}