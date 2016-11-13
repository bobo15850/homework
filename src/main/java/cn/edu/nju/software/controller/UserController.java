package cn.edu.nju.software.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.edu.nju.software.consts.ResultDO;
import cn.edu.nju.software.model.User;
import cn.edu.nju.software.service.RiskService;
import cn.edu.nju.software.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private RiskService riskService;

	@RequestMapping(value = "login", method = { RequestMethod.POST })
	public String login(HttpServletRequest request, String nick, String password) {
		ResultDO<User> resultDO = userService.login(nick, password);
		if (!resultDO.isSuccess()) {
			request.setAttribute("errorMsg", resultDO.getErrorMsg());
			return "login";
		}
		HttpSession session = request.getSession();
		session.setAttribute("userId", resultDO.getModel().getId());
		request.setAttribute("nick", resultDO.getModel().getNick());
		request.setAttribute("risks", riskService.getRiskByUserId(resultDO.getModel().getId()).getModel());
		return "home";
	}

	@RequestMapping(value = "register", method = { RequestMethod.POST })
	public String register(HttpServletRequest request, String nick, String password) {
		ResultDO<Boolean> resultDO = userService.register(nick, password);
		if (!resultDO.isSuccess() || Boolean.FALSE == resultDO.getModel()) {
			request.setAttribute("errorMsg", resultDO.getErrorMsg());
			return "register";
		}
		return "login";
	}

	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("userId");
		return "login";
	}

	@RequestMapping("toHome")
	public String toHome(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("userId");
		ResultDO<User> resultDO = userService.getUserById(userId);
		request.setAttribute("nick", resultDO.getModel().getNick());
		request.setAttribute("risks", riskService.getRiskByUserId(userId).getModel());
		return "home";
	}
}
