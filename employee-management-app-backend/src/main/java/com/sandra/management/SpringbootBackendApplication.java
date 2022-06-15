package com.sandra.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sandra.management.model.Employee;
import com.sandra.management.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
		
	
	}

	@Autowired
	private EmployeeRepository employeeRepository;
//	@Override
//	public void run(String... args) throws Exception {
////		Employee employee1 = new Employee();
////		employee1.setFirstName("Ramesh");
////		employee1.setLastName("Fadatare");
////		employee1.setEmailId("ramesh@r.com");
////		employeeRepository.save(employee1);
////		
////		Employee employee2 = new Employee();
////		employee2.setFirstName("John");
////		employee2.setLastName("Johnson");
////		employee2.setEmailId("john@r.com");
////		employeeRepository.save(employee2);
//	}

}
