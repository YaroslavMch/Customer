package com.spring.customer.model;

import com.spring.customer.model.data.Contact;
import com.spring.customer.model.data.CustomerType;
import com.spring.customer.model.data.Departament;
import com.spring.customer.model.data.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {


	private int id;

	private String name;
	private String adress;
	private String email;
	private String phone;
	private String comments;

	private List <User> userList;
	private List<Contact> contactList;
	private List<Departament> departamentList;

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private CustomerType type;

	public Customer() {

	}

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
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	public List<User> getUserList() {
		return userList;
	}


	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	public List<Departament> getDepartamentList() {
		return departamentList;
	}

	public void setDepartamentList(List<Departament> departamentList) {
		this.departamentList = departamentList;
	}

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}
}
