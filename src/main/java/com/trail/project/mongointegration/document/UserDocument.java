package com.trail.project.mongointegration.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * UserDocument interacts with the mongo db
 * value passed in @Document is the collection name as well
 * hence, it needs to be named carefully.
 * 
 * if the @Document is not passed, mongo shall take the class
 * name as the collection name.
 * @author lincoln
 *
 */
@Document(collection="user_details")
public class UserDocument {
	
	// @Id denotes we are assigning this as our id and 
	// mongo shall not assign its own id in its db.
	@Id
	private String userId;
	private String password;
	private String name;
	private String city;
	private String email;
	private String phone;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
}
