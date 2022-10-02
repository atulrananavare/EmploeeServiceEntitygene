package com.javaTechie.dto;

public class EmployeeDTO {
    private Integer id;
    private String empName;
    private String department;
    private Double salary;

    public EmployeeDTO() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
    }

    public EmployeeDTO(Integer id, String empName, String department, Double salary) {
        this.id = id;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
    }
}