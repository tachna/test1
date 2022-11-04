package pnu.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value="/signUoPage.do", method = RequestMethod.GET)
	public String signUpPage() {
		return "user/signUp.jsp";
	}
}
