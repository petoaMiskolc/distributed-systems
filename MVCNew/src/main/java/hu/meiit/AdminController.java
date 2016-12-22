package hu.meiit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hu.meiit.model.NewUserRequest;
import hu.meiit.si.RegistrationResult;
import hu.meiit.si.UserAdder;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserManager userManager;
	
	@Autowired
	UserAdder userAdder;
	
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
		RegistrationResult result = userAdder.addUser(newUserRequest);
		switch(result) {
		case SUCCESS: return "redirect:/admin/status";
		case IN_USE: newUserRequest.setNameAlreadyInUse(true);
		case EMPTY: return "newuser";
		default: return "newuser";
		}
		
	}
	
}
