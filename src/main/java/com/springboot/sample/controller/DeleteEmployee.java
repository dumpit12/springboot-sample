package com.springboot.sample.controller;

import com.springboot.sample.repository.services.RepositoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class DeleteEmployee {
    private final RepositoryService repositoryService;

    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam String id) {
        return repositoryService.deleteEmployeeById(id);
    }
}