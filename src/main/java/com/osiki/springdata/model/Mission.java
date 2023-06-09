package com.osiki.springdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "mission_tbl")
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private String name;

    private int duration;

    @ManyToMany(mappedBy = "missions")
    private List<Employee> employees;
}
