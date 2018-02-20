package com.spring.customer.model;

import com.spring.customer.model.data.CustomerType;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "customer")
public class Customer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private String adress;
	private String email;
	private String phone;
	private String comments;
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private CustomerType type;

	public Customer() {

	};

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public Customer(String name, String adress, String email, String phone, String comments) {
		this.name = name;
		this.adress = adress;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
