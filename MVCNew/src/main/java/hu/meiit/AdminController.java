package hu.meiit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.meiit.model.NewUserRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {

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
		} else if(newUserRequest.getUserName().equals("Albert")) {
			return "error";
		} else {
			return "status";
		}
	}
	
}
