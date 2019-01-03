package com.krishna.springframework.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Developer implements Role {

	public String typeOfWork() {
		return "develops Various Applications";
		
	}
	

}
