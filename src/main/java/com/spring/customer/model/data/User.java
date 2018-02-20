package com.spring.customer.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "users")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int customerId;
	private String name;
	private String adress;
	private String email;
	private String department;
	private String login;
	private String password;

	public User() {
	};

	public User(int id, int customerId, String name, String adress, String email, String department, String login, String password) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.department = department;
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
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

	public String getEmail() {
		return email;
	}

	public String getDepartment() {
		return department;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void seId(int customerId) {
		this.customerId = customerId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setUserEmail(String email) {
		this.email = email;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
