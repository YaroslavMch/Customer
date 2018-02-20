package com.spring.customer.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "departaments")
public class Departament implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int customerId;
	private String name;
	private String adress;
	private String manager;
	private String nomberSchool;

	public Departament() {
	};

	public Departament(int customerId, String name, String adress, String manager) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.adress = adress;
		this.manager = manager;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public String getManager() {
		return manager;
	}

	public String getNomberSchool() {
		return nomberSchool;
	}

	public void setNomberSchool(String nomberSchool) {
		this.nomberSchool = nomberSchool;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setId(int customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

}
