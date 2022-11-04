package pnu.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pnu.user.vo.UserVo;

@Controller
public class MainController {

	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String mainPage() {
		return "main.jsp";
	}
	
	
	@RequestMapping(value="/loginPage.do", method = RequestMethod.GET)
	public String loginPage() {
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public String login(@ModeLAttribute UserVo user) {
		

		if(userService.selectPwd(user.getUserId(), user.getPwd())) {
			return "main.jsp";
		}
		else {
			return "login.jsp";
		}

	}
	
}
