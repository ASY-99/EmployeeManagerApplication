package com.example.EmployeeManagerApplication;

import com.example.EmployeeManagerApplication.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//I used (exclude = {DataSourceAutoConfiguration.class}) when we are not using database config but dependencies are still there in pom.xml
public class EmployeeManagerApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(EmployeeManagerApplication.class, args);
	}
}