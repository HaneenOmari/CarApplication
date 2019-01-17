package com.example.CarApplication.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
	 private String name;
//
//	 @OneToMany(cascade = CascadeType.ALL, mappedBy="person_id")
//	 private List<Person_Trip> person_trip;
	public Person() {
	}

	public long getId() {
		return id;
	}

	public Person( String name) {
		super();
	
		this.name = name;
	}

//	public Person(String name, List<Person_Trip> person_trip) {
//		super();
//		this.name = name;
//		this.person_trip = person_trip;
//	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
