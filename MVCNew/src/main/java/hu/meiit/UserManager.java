package hu.meiit;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManager {
	
	Set<String> users;
	
	public UserManager() {
		users = new HashSet<String>();
	}

	public boolean addUser(String name) {
		if (users.contains(name)) {
			return false;
		} else {
			users.add(name);
			return true;
		}
	}
}
