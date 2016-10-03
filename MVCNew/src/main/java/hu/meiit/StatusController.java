package hu.meiit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {

	@Autowired
	UserManager userManager;
	
	@ModelAttribute("userList") List<User> getUsers() {
		return userManager.getUsers();
	}
	
	@RequestMapping("/admin/status")
	public String status() {
		return "status";
	}
}
