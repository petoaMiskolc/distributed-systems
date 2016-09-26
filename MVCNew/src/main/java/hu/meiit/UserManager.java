package hu.meiit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UserManager {
	
	private Set<String> users;
	
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
	
	public List<String> getUsers() {
		return new ArrayList<String>(users);
	}
}
