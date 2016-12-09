package hu.meiit;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@Autowired
	UserManager userManager;
	
	@ModelAttribute("userList") List<User> getUsers() {
		return userManager.getUsers();
	}
	
	@RequestMapping("/admin/status")
	public List<User> status() {
		return userManager.getUsers();
	}
}
