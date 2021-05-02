package com.jpaPrac.jpademo.Repositories;

import com.jpaPrac.jpademo.Entities.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends CrudRepository<Employees, Integer> {
    public Optional<Employees> findByEmployeeId(Integer id);
}
