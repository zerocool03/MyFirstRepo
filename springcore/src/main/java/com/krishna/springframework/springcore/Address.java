package com.krishna.springframework.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:addr.properties")
public class Address {

	
	
	
	@Value("${flatnumber}")
	String flatnumber;
	@Value("${locality}")
	String locality;
	@Value("${city}")
	String city;
	@Value("${state}")
	String state;
	public String getFlatnumber() {
		return flatnumber;
	}
	public void setFlatnumber(String flatnumber) {
		this.flatnumber = flatnumber;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [flatnumber=" + flatnumber + ", locality=" + locality + ", city=" + city + ", state=" + state
				+ "]";
	}
	
}
