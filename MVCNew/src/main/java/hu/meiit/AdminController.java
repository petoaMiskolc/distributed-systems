package hu.meiit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String newUserSubmit() {
		return "newuser";
	}
	
}
