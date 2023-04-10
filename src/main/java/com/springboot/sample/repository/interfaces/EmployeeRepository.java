package com.springboot.sample.repository.interfaces;

import com.springboot.sample.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
