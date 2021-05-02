package com.jpaPrac.jpademo.Repositories;

import com.jpaPrac.jpademo.Entities.Departments;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DepartmentRepo extends CrudRepository<Departments, Integer> {
    List<Departments> findByDepartmentName(String departmentName, Sort sort);
}
