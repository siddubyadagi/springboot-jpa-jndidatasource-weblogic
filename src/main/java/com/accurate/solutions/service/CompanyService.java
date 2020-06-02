/**
 * 
 */
package com.accurate.solutions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accurate.solutions.entity.Company;
import com.accurate.solutions.repository.CompanyRepository;

/**
 * @author sidagond.byadagi
 *
 */

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;

	public List<Company> getCompanyList() {
		return companyRepository.findAll();
	}
}
