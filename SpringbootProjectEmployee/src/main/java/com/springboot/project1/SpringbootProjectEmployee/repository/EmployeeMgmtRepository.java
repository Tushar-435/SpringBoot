package com.springboot.project1.SpringbootProjectEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.project1.SpringbootProjectEmployee.model.EmployeeMgmt;

@Repository
public interface EmployeeMgmtRepository extends JpaRepository<EmployeeMgmt,Long> {

}
