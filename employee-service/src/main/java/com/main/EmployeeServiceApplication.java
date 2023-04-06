package com.main;

//import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.main.mapper.EmployeeMapper;

@SpringBootApplication
public class EmployeeServiceApplication {
/*
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
*/
	@Bean
	EmployeeMapper mapper() {
		return EmployeeMapper.INSATANCE;
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
