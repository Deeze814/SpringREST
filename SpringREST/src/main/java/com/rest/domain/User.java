package com.rest.domain;


public class User {
	
	private int userID;
	private String firstName;
	private String lastName;
	private String passWord;
	private String detail;
	private String birthDate;
	private String gender;
	private String country;
	private boolean smoking;
	private String email;
	
	//Default constructor for bean initialization
	public User(){}
	
	public User(int userID, String firstName, String lastName){
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User(User user){
		this.userID = user.userID;
		this.firstName = user.firstName;
		this.lastName = user.lastName;
		this.passWord = user.passWord;
		this.detail = user.detail;
		this.birthDate = user.birthDate;
		this.gender = user.gender;
		this.country = user.country;
		this.smoking = user.smoking;
		this.email = user.email;
	}

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isSmoking() {
		return smoking;
	}
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}	
	public String getEmail() {
		return email;
	}
}
