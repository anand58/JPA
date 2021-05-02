package com.jpaPrac.jpademo.Repositories;

import com.jpaPrac.jpademo.Entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    public Student findById(int id);
    List<Student> findByName(String name);
}
