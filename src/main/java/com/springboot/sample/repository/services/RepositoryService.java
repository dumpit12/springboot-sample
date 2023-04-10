package com.springboot.sample.repository.services;

import com.springboot.sample.dto.Employee;
import com.springboot.sample.repository.interfaces.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class RepositoryService {
    private final EmployeeRepository employeeRepository;

    public Employee addToDatabase(String name) {
        String randomID = UUID.randomUUID().toString();
        Employee employee = Employee.builder()
                .id(randomID)
                .name(name)
                .build();

        try {
            employeeRepository.save(employee);
            return employee;
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return null;
    }

    public List<Employee> fetchAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }

    public String deleteEmployeeById(String id) {
        if (employeeRepository.existsById(id)) {
            try {
                employeeRepository.deleteById(id);
                return id + " deleted from database";
            } catch (Exception e) {
                log.error(e.getMessage());
            }
        }

        return "Id doesn't exist";
    }
}
