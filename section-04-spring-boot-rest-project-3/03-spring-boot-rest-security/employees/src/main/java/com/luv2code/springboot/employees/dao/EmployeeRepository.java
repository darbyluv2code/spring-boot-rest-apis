package com.luv2code.springboot.employees.dao;

import com.luv2code.springboot.employees.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // that's it ... no need to write any code LOL!

}
