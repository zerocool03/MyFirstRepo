package org.railways.reservations.beans;

import java.util.Date;

public class Passenger {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public Date getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(Date dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	private String fromPlace;
	private String toPlace;
	private Date dateOfTravel;
	private int trainNo;
}
