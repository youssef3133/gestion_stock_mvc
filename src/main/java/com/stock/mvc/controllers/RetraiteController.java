package com.stock.mvc.controllers;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.mvc.entity.Employeur;
import com.stock.mvc.entity.Retraite;
import com.stock.mvc.services.IEmployeurService;
import com.stock.mvc.services.IRetraiteService;

@Controller
@RequestMapping(value = "/retraite", method = RequestMethod.GET)
public class RetraiteController {
	
private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

@Autowired
private IRetraiteService retraiteservice;

@RequestMapping(value ="")
public String salarie(Model model) {
	
	List<Retraite> retraites = retraiteservice.selectAll();
	if(retraites == null){
		retraites = new ArrayList<Retraite>();
	}
	model.addAttribute("retraites", retraiteservice.selectAll());
	
	return "retraite/retraite";
}

}
