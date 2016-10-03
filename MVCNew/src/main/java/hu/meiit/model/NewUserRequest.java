package hu.meiit.model;

import java.util.ArrayList;
import java.util.List;

public class NewUserRequest {
	private String userName;
	private List<String> color;
	private String gender;
	private String education;
	
	//Used as feedback by AdminController
	private boolean nameAlreadyInUse;
	
	public NewUserRequest() {
		userName = "";
		color = new ArrayList<String>();
		gender = "";
		education = "";
		nameAlreadyInUse=false;
	}
	
	public boolean isNameAlreadyInUse() {
		return nameAlreadyInUse;
	}

	public void setNameAlreadyInUse(boolean nameAlreadyInUse) {
		this.nameAlreadyInUse = nameAlreadyInUse;
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
	
	@Override
	public String toString() {
		String result = "Name: " + userName;
		result += ", Education: " + education;
		result += ", Gender: " + gender;
		result += ", Colors: ";
		for (String c : color) {
			result += c + ",";
		}
		return result;
	}
	
	public boolean containsColor(String c) {
		return color.stream().anyMatch(color -> color.equals(c));
	}
}
