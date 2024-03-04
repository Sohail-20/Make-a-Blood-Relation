package com.example.demoForBloodBuddy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blood { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String Name;
	private String Email;
	private String bloodGroup;
	private long Number;
	private String Area;
	private String Address;
	private long Age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	public long getNumber() {
		return Number;
	}
	public void setNumber(long number) {
		Number = number;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getAge() {
		return Age;
	}
	public void setAge(long age) {
		Age = age;
	}
	public Blood(long id, String name, String email,String bloodGroup,  long number, String area, String address, long age) {
		super();
		this.id = id;
		this.Name = name;
		this.Email = email;
		this.Number = number;
		this.Area = area;
		this.Address = address;
		this.Age = age;
		this.bloodGroup = bloodGroup;
		
	}
	
	public Blood() {
		super();
		
	}
	@Override
	public String toString() {
		return "Blood [id=" + id + ", Name=" + Name + ", Email=" + Email + ", bloodGroup=" + bloodGroup + ", Number="
				+ Number + ", Area=" + Area + ", Address=" + Address + ", Age=" + Age + "]";
	}
		
	

}
