package hu.meiit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "Something";
	}
	
}
