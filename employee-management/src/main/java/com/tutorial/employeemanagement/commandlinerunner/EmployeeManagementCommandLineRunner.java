package com.tutorial.employeemanagement.commandlinerunner;

import com.tutorial.employeemanagement.entity.Department;
import com.tutorial.employeemanagement.entity.Employee;
import com.tutorial.employeemanagement.repository.DepartmentRepository;
import com.tutorial.employeemanagement.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class EmployeeManagementCommandLineRunner implements CommandLineRunner
{
    private final DepartmentRepository departmentRepository;

    private final EmployeeRepository employeeRepository;

    public EmployeeManagementCommandLineRunner(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Stream.of(new Department(new Long(1),"HR", "Human Resource"),
                  new Department(new Long(2),"R&D", "Research and Development"))
                .forEach(department ->
                departmentRepository.save(department)
        );
        departmentRepository.findAll().forEach(System.out::println);

        Stream.of(new Employee(new Long(1), "aaa", "1234", "aaa@gmail.com",new Long(1)))
                .forEach(employee ->
                        employeeRepository.save(employee)
                );
        employeeRepository.findAll().forEach(System.out::println);
    }
}
