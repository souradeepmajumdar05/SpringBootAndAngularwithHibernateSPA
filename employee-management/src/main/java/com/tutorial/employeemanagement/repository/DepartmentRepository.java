package com.tutorial.employeemanagement.repository;

import com.tutorial.employeemanagement.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
