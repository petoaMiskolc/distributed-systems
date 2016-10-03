package hu.meiit.model;

import java.util.ArrayList;
import java.util.List;

public class NewUserRequest {
	private String userName;
	private List<String> color;
	private String gender;
	private String education;
	
	public NewUserRequest() {
		userName = "";
		color = new ArrayList<String>();
		gender = "";
		education = "";
	}
	
	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String uname) {
		userName = uname;
	}
}
