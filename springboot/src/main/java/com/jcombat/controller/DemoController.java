package com.jcombat.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "welcome";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,Map<String, Object> model) {
		model.put("username",request.getParameter("firstname"));
		return "login";
	}
}