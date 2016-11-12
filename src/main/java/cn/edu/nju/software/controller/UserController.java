package cn.edu.nju.software.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("/test")
	public String test(HttpServletRequest request) {
		request.setAttribute("param", "test");
		return "test";
	}
}
