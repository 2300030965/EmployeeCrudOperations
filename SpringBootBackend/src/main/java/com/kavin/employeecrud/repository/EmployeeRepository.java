package com.kavin.employeecrud.repository;

import com.kavin.employeecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all the CRUD methods
}
