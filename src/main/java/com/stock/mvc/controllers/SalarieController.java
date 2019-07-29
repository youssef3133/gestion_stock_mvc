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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stock.mvc.entity.Salarie;
import com.stock.mvc.services.ISalarieService;

@Controller
@RequestMapping(value = "/salarie", method = RequestMethod.GET)
public class SalarieController {
	
	@Autowired
	private ISalarieService salarieservice;
	
	@RequestMapping(value ="")
	public String salarie(Model model) {
		List<Salarie> salaries = salarieservice.selectAll();
		if(salaries == null){
			salaries = new ArrayList<Salarie>();
		}
		model.addAttribute("salaries", salaries);
		
		return "salarie/salarie";
	}
	
	@RequestMapping(value ="/nouveau")
	public String ajouterUnSalarie(Model model) {
		Salarie salarie = new Salarie();
		model.addAttribute("salarie", salarie);
		
		return "salarie/ajouterSalarie";
		
	}
	
	@RequestMapping(value ="/modifier/{id}")
	public String modifierUnSalarie(Model model,@PathVariable Long id) {
		
		if (id != null) {
			Salarie salarie = salarieservice.getByID(id);
			if (salarie != null) {
				model.addAttribute("salarie", salarie);
			}
		}		
		return "salarie/ajouterSalarie";		
	}
	
	@RequestMapping(value ="/supprimer/{id}")
	public String supprimerUnSalarie(Model model, @PathVariable Long id) {
		
		salarieservice.remove(id);
		return "redirect:/salarie";	
	}
	
	@RequestMapping(value = "/enregistrer", method = RequestMethod.POST)
	public String enregistrerUnSalarie(Model model, Salarie salarie) {
		if (salarie.getId() != null) {
			salarieservice.update(salarie);
		}else {
		salarieservice.save(salarie);
		}
		return "redirect:/salarie";
	}
	
	

}
