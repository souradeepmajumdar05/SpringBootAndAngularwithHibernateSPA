package com.tutorial.employeemanagement.contoller;

import com.tutorial.employeemanagement.entity.Department;
import com.tutorial.employeemanagement.entity.Employee;
import com.tutorial.employeemanagement.repository.DepartmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController
{
        private final DepartmentRepository departmentRepository;

        public DepartmentController(DepartmentRepository departmentRepository) {
                this.departmentRepository = departmentRepository;
        }
        @GetMapping("/departments")
        public List<Department> getAllDepartments()
        {
                return (List<Department>) departmentRepository.findAll();
        }

        @GetMapping("/departments/{id}")
        public Optional getEmployeesById(@PathVariable("id") Long id)
        {
            return  departmentRepository.findById(id);
        }

        @PostMapping("/departments")
        public void createDepartments(@RequestBody Department department)
        {
                departmentRepository.save(department);
        }

        @PutMapping("/departments")
        public void updateUser()
        {
               // departmentRepository.save();
        }

        @DeleteMapping("/departments/{id}")
        public void deleteDepartments(@PathVariable("id") Long id)
        {
                departmentRepository.deleteById(id);
        }
}
