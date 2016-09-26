package hu.meiit.model;

public class NewUserRequest {
	private String userName;
	
	public NewUserRequest() {
		userName = "";
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String uname) {
		userName = uname;
	}
}
