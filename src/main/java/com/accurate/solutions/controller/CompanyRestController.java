/**
 * 
 */
package com.accurate.solutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accurate.solutions.entity.Company;
import com.accurate.solutions.service.CompanyService;

/**
 * @author sidagond.byadagi
 *
 */

@RestController
public class CompanyRestController {
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping(value = "/test")
	public ResponseEntity<String> getHealth(){
		return new ResponseEntity<String>("Healthy", HttpStatus.OK);
	}
	

	@GetMapping("/company")
	public ResponseEntity<List<Company>> getCompanyList() {
		return new ResponseEntity<List<Company>>(companyService.getCompanyList(), HttpStatus.OK);
	}
}
