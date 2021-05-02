package com.jpaPrac.jpademo;

import com.jpaPrac.jpademo.Entities.Employees;
import com.jpaPrac.jpademo.Repositories.EmployeeRepo;
import com.jpaPrac.jpademo.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories
public class JpademoApplication{
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}
}
