package com.tutorial.employeemanagement.contoller;

import com.tutorial.employeemanagement.entity.Employee;
import com.tutorial.employeemanagement.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController
{
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return (List<Employee>) employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional getEmployeesById(@PathVariable("id") Long id)
    {
        return  employeeRepository.findById(id);
    }

    @PostMapping("/employees")
    public void createUser(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
    }

    @PutMapping("/employees")
    public void updateUser()
    {

    }

    @DeleteMapping("/employees/{id}")
    public void deleteUser(@PathVariable("id") Long id)
    {
        employeeRepository.deleteById(id);
    }

}
