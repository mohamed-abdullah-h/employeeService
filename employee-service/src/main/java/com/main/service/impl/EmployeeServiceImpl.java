package com.main.service.impl;

import org.springframework.stereotype.Service;

import com.main.dto.EmployeeDto;
import com.main.entity.Employee;
import com.main.mapper.EmployeeMapper;
import com.main.repository.EmployeeRepository;
import com.main.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	private EmployeeMapper mapper;
//	private ModelMapper mapper;

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		/* convert EmployeeDto to Employee using Model Mapper
		Employee employee = mapper.map(employeeDto, Employee.class);
		Employee saveDEmployee = employeeRepository.save(employee);
		EmployeeDto savedEmployeeDto = mapper.map(saveDEmployee, EmployeeDto.class);
*/
//		 convert EmployeeDto to Employee using Map Struct
		Employee employee = mapper.unmap(employeeDto);

		Employee saveDEmployee = employeeRepository.save(employee);

		EmployeeDto savedEmployeeDto = mapper.map(saveDEmployee);
		
		return savedEmployeeDto;
	}

	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		 Employee employee = null;
		 try {
			employee = employeeRepository.findById(employeeId).get();
		} catch (Exception e) {
			throw new ResourceNotFoundException(e.getMessage());
		}
		 /* convert Employee to EmployeeDto using Model Mapper
		 EmployeeDto empDto = mapper.map(employee, EmployeeDto.class);
		 */
	//	 convert Employee to EmployeeDto using Map Struct
		 EmployeeDto empDto = mapper.map(employee);
		return empDto;
	}

}
