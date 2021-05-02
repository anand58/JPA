package com.jpaPrac.jpademo.Repositories;

import com.jpaPrac.jpademo.Entities.Departments;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepo extends CrudRepository<Departments, Integer> {
}
