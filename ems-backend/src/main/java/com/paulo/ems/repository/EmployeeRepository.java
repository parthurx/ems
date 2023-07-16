package com.paulo.ems.repository;

import com.paulo.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public class EmployeeRepository extends JpaRepository<Employee, Long> {
}
