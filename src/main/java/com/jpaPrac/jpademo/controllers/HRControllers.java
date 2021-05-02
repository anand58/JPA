package com.jpaPrac.jpademo.controllers;

import com.jpaPrac.jpademo.Entities.Departments;
import com.jpaPrac.jpademo.Entities.JobHistory;
import com.jpaPrac.jpademo.service.HRServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("hr")
public class HRControllers {

    @Autowired
    HRServices hrServices;

    @GetMapping("/dept/{id}")
    public Departments getDepartmentsById(@PathVariable Integer id){
        return hrServices.getDepatments(id);
    }

    @GetMapping("/dept/departments")
    public List<Departments> getDepartments(){
        return hrServices.getDepatments();
    }

    @GetMapping("/dept/sorted/{departmentName}")
    public List<Departments> getByDepartmentName(@PathVariable String departmentName){
        return hrServices.findByDeparment(departmentName);
    }

    @GetMapping("/job/{employeeId}/{startDate}")
    public JobHistory getJobHistoryById(@PathVariable Map<String, String> pathVar) throws ParseException {
        Date date1=new SimpleDateFormat("dd-MM-yy").parse(pathVar.get("startDate"));
        return hrServices.getJobHistoryById(pathVar.get("employeeId"), date1);
    }

    @GetMapping("/job/jobs")
    public List<JobHistory> getJobHistory(){
        return hrServices.getJobHistory();
    }

}
