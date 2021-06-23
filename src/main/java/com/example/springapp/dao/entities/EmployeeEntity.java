package com.example.springapp.dao.entities;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeEntity extends UserEntity {

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
