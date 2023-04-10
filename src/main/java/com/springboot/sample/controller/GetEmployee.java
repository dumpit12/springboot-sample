package com.springboot.sample.controller;

import com.springboot.sample.dto.Employee;
import com.springboot.sample.repository.services.RepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class GetEmployee {

    private final RepositoryService repositoryService;
    @GetMapping("/fetch/all")
    public List<Employee> fetchAll(){
        return repositoryService.fetchAllEmployees();
    }

    @GetMapping("/fetch/id")
    public Optional<Employee> fetchById(@RequestParam String id){
        return repositoryService.getEmployeeById(id);
    }
}
