package hu.meiit;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFormat;

import hu.meiit.model.NewUserRequest;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@JsonFormat(shape = JsonFormat.Shape.OBJECT)
	public enum ReturnCode { 
		SUCCESS("success"), EXISTING_NAME("existing-name"), NO_NAME("missing-name"); 
		
		private String code;
		
		private ReturnCode(String code) {
			this.code=code;
		}
		
		public String getCode() {
			return code;
		}
	}

	
	@Autowired
	private UserManager userManager;
	
	@RequestMapping(value = "/new-user", method=RequestMethod.GET)
	public ReturnCode newUser(@ModelAttribute NewUserRequest newUserRequest) {
		return newUserSubmit(newUserRequest);
	}
	
	@RequestMapping(value = "/new-user", method=RequestMethod.POST)
	public ReturnCode newUserSubmit(@ModelAttribute NewUserRequest newUserRequest) {
		if (newUserRequest.getUserName() == null) {
			return ReturnCode.NO_NAME;
		} else if (newUserRequest.getUserName().equals("")) {
			return ReturnCode.NO_NAME;
		} else {
			User user = new User(newUserRequest.getGender(),
					             newUserRequest.getUserName(),
					             newUserRequest.getEducation(),
					             new ArrayList<String>(newUserRequest.getColor()));
			boolean valid = userManager.addUser(user);
			if (valid) {
				return ReturnCode.SUCCESS;
			} else {
				newUserRequest.setNameAlreadyInUse(true);
				return ReturnCode.EXISTING_NAME;
			}
		}
	}
	
}
