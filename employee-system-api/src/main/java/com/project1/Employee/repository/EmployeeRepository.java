package com.project1.Employee.repository;

import com.project1.Employee.entity.EmployeeEntity;
import com.project1.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
