package hu.meiit;

import java.util.ArrayList;

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
	
	@RequestMapping("/get-balance")
	public String getBalance() {
		return "balance";
	}
	
	@RequestMapping(value = "/new-user", method=RequestMethod.GET)
	public String newUser(@ModelAttribute NewUserRequest newUserRequest) {
		return "newuser";
	}
	
	@RequestMapping(value = "/new-user", method=RequestMethod.POST)
	public String newUserSubmit(@ModelAttribute NewUserRequest newUserRequest) {
		if (newUserRequest.getUserName() == null) {
			return "newuser";
		} else if (newUserRequest.getUserName().equals("")) {
			return "newuser";
		} else {
			User user = new User(newUserRequest.getGender(),
					             newUserRequest.getUserName(),
					             newUserRequest.getEducation(),
					             new ArrayList<String>(newUserRequest.getColor()));
			boolean valid = userManager.addUser(user);
			if (valid) {
				return "redirect:/admin/status";
			} else {
				newUserRequest.setNameAlreadyInUse(true);
				return "newuser";
			}
		}
	}
	
}
