package com.zen;

import javax.persistence.Entity ;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class CustomerEntity {
	@Id
	private String username;
	private String userpass ;
	private String type;
	
	
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerEntity(String username, String userpass, String type){
		super();
		this.username=username;
		this.userpass=userpass;
		this.type=type;
	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpass() {
		return userpass;
	}

	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "CustomerEntity [username=" + username + ", userpass=" + userpass + 
				","+ " type=" + type + "]";
	}

}
