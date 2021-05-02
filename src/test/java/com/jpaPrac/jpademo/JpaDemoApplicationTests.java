package com.jpaPrac.jpademo;

import com.jpaPrac.jpademo.Entities.Departments;
import com.jpaPrac.jpademo.Entities.Employees;
import com.jpaPrac.jpademo.Repositories.DepartmentRepo;
import com.jpaPrac.jpademo.Repositories.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class JpaDemoApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	DepartmentRepo departmentRepo;

	@Test
	void contextLoads() {
		departmentRepo.save(new Departments(30, "Digital-2", 17665, 1700));
		//emp.setEmail("anand.tiwari@gmail.com");
		//employeeRepo.save(emp);
		Optional<Departments> em = departmentRepo.findById(30);
		em.ifPresent(e -> System.out.println(">>>>>>>>>>>>>>>>" + e.getDepartmentName()));

	}


}
