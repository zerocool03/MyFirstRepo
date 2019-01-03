package com.krishna.springframework.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:emp.properties")
public class Employee {

	@Autowired
	Environment env;

	@Value("${name}")
	String name;

	@Value("${id}")
	int id;
	@Value("${age}")
	int age;
	@Autowired
	Address address;
	@Autowired
	@Qualifier("developer")
	Role role;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		String tmp = role.typeOfWork();
		
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + ", address=" + address + ", role=" + tmp
				+ "]";
	}

}
