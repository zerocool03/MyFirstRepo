package com.krishna.hibernateProject.MyFirstHibernateProj;

import java.sql.Date;

public class Cats {

	public Cats(int id, String name, String owner) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.owner = owner;
		this.id=id;
	}

	public Cats() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}


	int id;
	String name;
	String owner;
	

}
