package com.example.demo.data.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name="Find_All",query="select p from Person p")
public class Person {

	@Id
	@GeneratedValue
	private int Id;
	
	private String name;
	private String location;
	private Date birthDate;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, String location, Date birthDate) {
		super();
		this.Id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	public Person( String name, String location, Date birthDate) {
		super();
		//this.Id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
	
}
