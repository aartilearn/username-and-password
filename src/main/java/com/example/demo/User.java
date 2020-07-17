package com.example.demo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;




@Entity
public class User {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int userid;
private String name;
private String email;
@NotBlank(message="required field can not be null")
@Size(min=0,max=10,message="size not greater than 10")
private int phone;
private String username;

//@OneToMany(cascade=CascadeType.ALL)
//@JoinColumn(name="category_id")

@OneToMany(cascade=CascadeType.ALL)
private List<Category> category;



public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public List<Category> getCategory() {
	return category;
}
public void setCategory(List<Category> category) {
	this.category = category;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
}
