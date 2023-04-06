package com.main.mapper;

import com.main.dto.EmployeeDto;
import com.main.entity.Employee;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-06T03:15:59+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee unmap(EmployeeDto dto) {
        if ( dto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setDepartmentCode( dto.getDepartmentCode() );
        employee.setEmail( dto.getEmail() );
        employee.setFirstName( dto.getFirstName() );
        employee.setId( dto.getId() );
        employee.setLastName( dto.getLastName() );
        employee.setOrganizationCode( dto.getOrganizationCode() );

        return employee;
    }

    @Override
    public EmployeeDto map(Employee emp) {
        if ( emp == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setDepartmentCode( emp.getDepartmentCode() );
        employeeDto.setEmail( emp.getEmail() );
        employeeDto.setFirstName( emp.getFirstName() );
        employeeDto.setId( emp.getId() );
        employeeDto.setLastName( emp.getLastName() );
        employeeDto.setOrganizationCode( emp.getOrganizationCode() );

        return employeeDto;
    }
}
