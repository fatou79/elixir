package com.fatou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;





@Controller
@SessionAttributes("name")

public class LoginController {
	@Autowired
	
	LoginService red;
	
//	@RequestMapping(value = "/login")
//	@ResponseBody
//	public String muguet() {
//		return "Good smell";
//	}


@RequestMapping(value = "/login", method = RequestMethod.GET)
public String muguet() {
	return "login";
}
@RequestMapping(value = "/login", method = RequestMethod.POST)
public String evidence(@RequestParam String name,@RequestParam String password, ModelMap model) {
	if(!red.validateUser(name, password)) {
		model.put("errorMessage","Invalid Credentials");
		return "login";
	}
	
	model.put("name", name);
	model.put("password", password);
	return "welcome";
}
}
