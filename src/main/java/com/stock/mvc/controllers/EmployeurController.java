package com.stock.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.mvc.entity.Employeur;
import com.stock.mvc.services.IEmployeurService;

@Controller
@RequestMapping(value = "/employeur", method = RequestMethod.GET)
public class EmployeurController {
	
private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
@Autowired
private IEmployeurService employeurservice;

@RequestMapping(value ="")
public String salarie(Model model) {
	
	List<Employeur> employeurs = employeurservice.selectAll();
	if(employeurs == null){
		employeurs = new ArrayList<Employeur>();
	}
	model.addAttribute("employeurs", employeurservice.selectAll());
	
	return "employeur/employeur";
}

}
