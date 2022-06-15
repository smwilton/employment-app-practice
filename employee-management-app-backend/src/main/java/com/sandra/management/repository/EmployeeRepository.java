package com.sandra.management.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sandra.management.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}