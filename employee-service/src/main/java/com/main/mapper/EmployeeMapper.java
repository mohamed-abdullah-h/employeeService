package com.main.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.main.dto.EmployeeDto;
import com.main.entity.Employee;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper INSATANCE = Mappers.getMapper(EmployeeMapper.class);
	
	Employee unmap(EmployeeDto dto);
	EmployeeDto map(Employee emp);
}
