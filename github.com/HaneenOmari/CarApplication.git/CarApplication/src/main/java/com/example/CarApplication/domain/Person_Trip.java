//package com.example.CarApplication.domain;
//
//
//import javax.persistence.Entity;
//
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//	@Entity
//	
//	public class Person_Trip {
//	
//	 private String items;
//
//private Person person;
//private Trip trip;
//
//@Id
//@ManyToOne
//@JoinColumn(name = "person_id")
//
//public void setPerson(Person person) {
//	this.person = person;
//}
//
//
//
//public Person_Trip(String items, Person person, Trip trip) {
//	super();
//	this.items = items;
//	this.person = person;
//	this.trip = trip;
//}
//
//
//
//@Id
//@ManyToOne
//@JoinColumn(name = "person_trip_id")
//public Trip getTrip() {
//	return trip;
//}
//public void setTrip(Trip trip) {
//	this.trip = trip;
//}
//
//
//
//	public String getItems() {
//		return items;
//	}
//
//
//	public void setItems(String items) {
//		this.items = items;
//	}
//
//
//	public Person_Trip() {
//	}
//
//
//	}
