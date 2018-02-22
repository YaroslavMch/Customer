package com.spring.customer.model.data;

import com.spring.customer.model.Customer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Departament implements Serializable {


	private int id;
	private String name;
	private String adress;
	private String manager;
	private String nomberSchool;
	private Customer customer;
	public Departament() {
	};

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getNomberSchool() {
		return nomberSchool;
	}

	public void setNomberSchool(String nomberSchool) {
		this.nomberSchool = nomberSchool;
	}

	@ManyToOne
	@JoinColumn(name = "customer_id")
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
