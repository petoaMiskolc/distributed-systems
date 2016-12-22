package hu.meiit.si;

import org.springframework.integration.annotation.Gateway;

import hu.meiit.User;
import hu.meiit.model.NewUserRequest;

public interface UserAdder {

	@Gateway
	RegistrationResult addUser(NewUserRequest req);
}
