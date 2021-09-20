package com.htc.user.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user-service")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1569713785512760779L;
	
	@Id
	private String name;
	private Long phoneNo;
	private String email;
	private int age;
	private String gender;
	private String loginId;
	private String password;
	public User() {
		super();
		
	}
	
	public User(String name, Long phoneNo, String email, int age, String gender, String loginId, String password) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.loginId = loginId;
		this.password = password;
	}

	public User(String name, Long phoneNo, String email, int age, String gender) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", age=" + age + ", gender="
				+ gender + ", loginId=" + loginId + ", password=" + password + "]";
	}
	
	
	
}
