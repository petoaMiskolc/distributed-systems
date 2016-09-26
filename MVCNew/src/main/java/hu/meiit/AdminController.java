package hu.meiit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.meiit.model.NewUserRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserManager userManager;

	@ModelAttribute("userList") List<String> getUsers() {
		return userManager.getUsers();
	}
	
	@RequestMapping("/status")
	public String status() {
		return "status";
	}
	
	@RequestMapping("/get-balance")
	public String getBalance() {
		return "balance";
	}
	
	@RequestMapping(value = "/new-user", method=RequestMethod.GET)
	public String newUser() {
		return "newuser";
	}
	
	@RequestMapping(value = "/new-user", method=RequestMethod.POST)
	public String newUserSubmit(@ModelAttribute NewUserRequest newUserRequest) {
		if (newUserRequest.getUserName() == null) {
			return "newuser";
		} else if (newUserRequest.getUserName().equals("")) {
			return "newuser";
		} else {
			boolean valid = userManager.addUser(newUserRequest.getUserName());
			if (valid) {
				return "status";
			} else {
				return "error";
			}
		}
	}
	
}
