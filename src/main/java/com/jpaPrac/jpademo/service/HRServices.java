package com.jpaPrac.jpademo.service;

import com.jpaPrac.jpademo.Entities.Departments;
import com.jpaPrac.jpademo.Entities.JobHistory;
import com.jpaPrac.jpademo.Entities.JobIdentifier;
import com.jpaPrac.jpademo.Repositories.DepartmentRepo;
import com.jpaPrac.jpademo.Repositories.EmployeeRepo;
import com.jpaPrac.jpademo.Repositories.JobHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class HRServices {

    @Autowired
    DepartmentRepo departmentRepo;

    @Autowired
    EmployeeRepo employeeRepo;

    @Autowired
    JobHistoryRepo jobHistoryRepo;

    public Departments getDepatments(Integer i){
        AtomicReference<Departments> d = new AtomicReference<>();
        departmentRepo.findById(i).ifPresent(e -> d.set(e));
        return d.get();
    }

    public List<Departments> findByDeparment(String departmentName){
        Sort.TypedSort<Departments> departments = Sort.sort(Departments.class);
        Sort sort = departments.by(Departments::getDepartmentName).ascending()
                               .and(departments.by(Departments::getDepartmentId).ascending());
        return departmentRepo.findByDepartmentName(departmentName, sort);
    }


    public List<Departments> getDepatments() {
        List<Departments> l = new ArrayList<>();
        departmentRepo.findAll().forEach(e -> l.add(e));
        return l;
    }

    public JobHistory getJobHistoryById(String jobId, Date startDate) {
//        AtomicReference<JobHistory> jobHistory = new AtomicReference<>();
//         jobHistoryRepo.findById(id).ifPresent(e -> {
//            jobHistory.set(e);});
//         return jobHistory.get();
//  JobIdentifier jobIdentifier = new JobIdentifier(jobId, startDate);
        //Date dt = new Date("13-01-01");
        return jobHistoryRepo.findById(new JobIdentifier(Integer.parseInt(jobId), startDate)).get();
    }

    public List<JobHistory> getJobHistory() {
        List<JobHistory> l = new ArrayList<>();
        jobHistoryRepo.findAll().forEach(e -> l.add(e));
        return l;
    }
}
