/**
 * 
 */
package com.accurate.solutions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sidagond.byadagi
 *
 */

@Entity
@Table(name = "accurate")
public class Company {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column(name = "companyname")
	private String companyname;
	
	@Column(name = "companyphone")
	private String companyphone;
	
	@Column(name = "companyaddress")
	private String companyaddress;
	
	@Column(name = "stockvalue")
	private String stockvalue;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyphone() {
		return companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public String getStockvalue() {
		return stockvalue;
	}

	public void setStockvalue(String stockvalue) {
		this.stockvalue = stockvalue;
	}

}
