package com.osiki.springdata;

import com.osiki.springdata.model.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String streetName;
    private String houseNumber;
    private String zipCode;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
