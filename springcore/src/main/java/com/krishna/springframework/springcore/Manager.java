package com.krishna.springframework.springcore;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Role{

	public String typeOfWork() {
		return "Manages projects";
		
	}

}
