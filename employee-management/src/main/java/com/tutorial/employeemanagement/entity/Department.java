package com.tutorial.employeemanagement.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "DEPARTMENT")
public class Department
{
    @Id
    @Column(name="DEPARTMENT_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    public Department()
    {
        this.id=null;
        this.name = "";
        this.description="";

    }

    public Department(Long id,String name,String description)
    {
        this.id=id;
        this.name = name;
        this.description= description;
    }


    public Long getId() {
        return id;
    }

    /*
    hibernate features: frame work will querry and store the list here based on id which needs to be
    foreign key in another table like employee in this case
    * */
    @OneToMany(/*cascade=CascadeType.ALL, */mappedBy = "department_id", fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SELECT)
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return Objects.equals(getId(), that.getId()) &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription());
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", employees=" + employees +
                '}';
    }
}
