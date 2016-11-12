package cn.edu.nju.software.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping(value = "login", method = { RequestMethod.POST })
	public String login() {
		return "index";
	}

	@RequestMapping(value = "register", method = { RequestMethod.POST })
	public String register() {
		return "login";
	}

}
