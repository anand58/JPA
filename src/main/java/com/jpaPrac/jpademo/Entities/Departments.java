package com.jpaPrac.jpademo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer department_id;
    private String department_name;
    private Integer manager_id;
    private Integer location_id;
}
