package com.example.hibernate.dao.entities;

import javax.persistence.*;
import lombok.*;

/**
 * @author Svetlana M.
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String city;
    private String street;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * getting street value
     * @return string street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @deprecated
     * set value of street {@link com.example.hibernate.dao.entities.AddressEntity#street}
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }
}
