package com.example.springapp.dao.entities;

import com.sun.istack.*;
import java.time.*;
import javax.persistence.*;

@MappedSuperclass
//@Entity
//@Table(name = "users_table")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "type_entity", discriminatorType = DiscriminatorType.INTEGER)
//@DiscriminatorValue("1")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    private String lastName;
//    private int age;
////    @OneToOne
////    private AddressEntity address;
//    private LocalDateTime dateCreated;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

//    public AddressEntity getAddress() {
//        return address;
//    }
//
//    public void setAddress(AddressEntity address) {
//        this.address = address;
//    }
}
