package com.jpaPrac.jpademo.Entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "JOB_HISTORY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobHistory {

    @EmbeddedId
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private JobIdentifier jobIdentifier;
    private Date end_date;
    private String job_id;
    private Integer department_id;
}
