/*
 * the policy java use to make the table in sql @table use to create table and we give name policy to table name
 * we assgin the table column name in this field like uid,year,policyname etc it take the info from the form and arrange by thier column name
 */
package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "policy") // Relation or Relational Table R
@Entity
public class Policy {
	@Id
	private int uid;
	private int years;
	private String policyname;
	private int amount;
	private int sum;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
}
