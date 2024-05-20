/*
 * the user java use to make the table in sql @table use to create table and we give name userinfo to table name
 * we assgin the table column name in this field like id,name,address etc it take the info from the form and arrange by thier column name
 */
package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//O-R-M Object-Relation-Mapping
//Mapping or Linking  M
@Table(name = "userinfo") // Relation or Relational Table R
@Entity // informs or signals that this is Entity Java Bean Class
public class User {// Object O

	@Id
	private int id;
	private String password;
	private String name;
	private String address;
	private String email;
	private int mobileNo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

}