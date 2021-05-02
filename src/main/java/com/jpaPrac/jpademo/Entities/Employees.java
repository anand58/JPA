package com.jpaPrac.jpademo.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Employees {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer employeeId;

    private String last_name;
    private String first_name;
    private String email;
    private String phone_number;
    private Date hire_date;
    private String job_id;
    private Double salary;
    private Double commission_pct;
    private Long manager_id;
    private Long department_id;
}
