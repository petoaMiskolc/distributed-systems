package hu.meiit;

import java.util.List;

public class User {

	String gender;
	String name;
	String education;
	List<String> colors;
	
	public User(String gender, String name, String education, List<String> colors) {
		super();
		this.gender = gender;
		this.name = name;
		this.education = education;
		this.colors = colors;
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getEducation() {
		return education;
	}

	public List<String> getColors() {
		return colors;
	}
	
	@Override
	public String toString() {
		String result = "Name: " + name;
		result += ", Education: " + education;
		result += ", Gender: " + gender;
		result += ", Colors: ";
		for (String c : colors) {
			result += c + ",";
		}
		return result;
	}
}
