package com.springboot.sample.controller;

import com.springboot.sample.dto.Employee;
import com.springboot.sample.repository.services.RepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AddEmployee {
    private final RepositoryService repositoryService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestParam String name){
        return repositoryService.addToDatabase(name);
    }
}
