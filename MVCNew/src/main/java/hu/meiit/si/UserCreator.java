package hu.meiit.si;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import hu.meiit.User;
import hu.meiit.UserManager;
import hu.meiit.model.NewUserRequest;

public class UserCreator {
	
	@Autowired
	UserManager manager;

	public User create(NewUserRequest newUserRequest) {
		return new User(newUserRequest.getGender(),
	             newUserRequest.getUserName(),
	             newUserRequest.getEducation(),
	             new ArrayList<String>(newUserRequest.getColor()));
	}
	
	public Object check(User user) {
		if (user.getName() == null) {
			return RegistrationResult.EMPTY;
		} else if (user.getName().equals("")) {
			return RegistrationResult.EMPTY;
		} else if (manager.isNameInUse(user.getName())){
			return RegistrationResult.IN_USE;
		} else {
			return user;
		}
	}
	
	public RegistrationResult register(User user) {
		manager.addUser(user);
		return RegistrationResult.SUCCESS;
	}

}
