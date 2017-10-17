package com.test.DemoHibPro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlienBeen {
	@Id
	private int id;
	private String nic;
	private String FName;
	private String LName;
	private int Age;
	private String Address;
	
	public String getAddress() {
		return Address;
	}
	public int getAge() {
		return Age;
	}public String getFName() {
		return FName;
	}public int getId() {
		return id;
	}public String getLName() {
		return LName;
	}public String getNic() {
		return nic;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setAge(int age) {
		Age = age;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
}
