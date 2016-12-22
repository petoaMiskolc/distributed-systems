package hu.meiit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class UserManager {
	
	private Set<User> users;
	
	public UserManager() {
		users = new HashSet<User>();
	}

	public boolean addUser(User user) {
		if (users.stream().anyMatch(u -> u.getName().equals(user.getName()))) {
			return false;
		} else {
			users.add(user);
			return true;
		}
	}
	
	public List<User> getUsers() {
		return new ArrayList<User>(users);
	}
	
	public boolean isNameInUse(String name) {
		if (users.stream().anyMatch(u -> u.getName().equals(name))) {
			return true;
		} else {
			return false;
		}
	}
}
