package com.example.springapp.dao.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee_table")
//@PrimaryKeyJoinColumn(name = "employee_id")
//@DiscriminatorValue("2")
public class EmployeeEntity extends UserEntity {

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
