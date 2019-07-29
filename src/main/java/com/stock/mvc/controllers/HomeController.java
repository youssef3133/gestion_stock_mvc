package com.stock.mvc.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {
	
	@RequestMapping(value = "")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/blank")
	public String blankHome() {
		return "blank/blank";
	}
	

//method = RequestMethod.GET -> pas besoin de le mettre car est mis par default

}
