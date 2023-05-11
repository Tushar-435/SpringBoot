package com.springboot.project1.SpringbootProjectEmployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project1.SpringbootProjectEmployee.model.EmployeeMgmt;
import com.springboot.project1.SpringbootProjectEmployee.repository.EmployeeMgmtRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeMgmtController {
	@Autowired
	EmployeeMgmtRepository emr;
	 
	@PostMapping("/show")
	public String show() {
		return "MUKUL KUMAR IS ";
		
	}
//	@PostMapping("/save")
//	public void saveEmployee(@RequestBody EmployeeMgmt em) {
//	emr.save(em);
//	}
//	
//	@PostMapping("/details")
//	public List<EmployeeMgmt> getEmp(){
//		return emr.findAll();	
//	}
}
