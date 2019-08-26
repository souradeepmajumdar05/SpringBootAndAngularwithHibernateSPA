package com.tutorial.employeemanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Objects;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @Column(name="EMPLOYEE_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;

    @NotEmpty
    @Column(name="PASSWORD", nullable=false)
    private String password;

    @NotEmpty
    @Column(name="EMAIL", nullable=false)
    private String email;

    @Column(name="DEPARTMENT_ID", nullable=false)
    private Long department_id;

    public Employee()
    {
        this.id=null;
        this.name = "";
        this.password="";
        this.email = "";
        this.department_id=null;
    }

    public Employee(Long id,String name,String password, String email,Long department_id)
    {
        this.id=id;
        this.name = name;
        this.password= password;
        this.email = email;
        this.department_id=department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId().equals(employee.getId()) &&
                name.equals(employee.name) &&
                password.equals(employee.password) &&
                email.equals(employee.email) &&
                department_id.equals(employee.department_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), name, password, email, department_id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", department_id=" + department_id +
                '}';
    }
}
