package org.baeldung.web.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

import org.baeldung.persistence.dao.ModelSystemViewRepository;
import org.baeldung.persistence.model.ModelSystemView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value = "/app", method = RequestMethod.GET)
public class AppController {
	@Autowired
	ModelSystemViewRepository model_system_repo;
	
	@RequestMapping(value = "admission2017", method = RequestMethod.GET,produces = "text/plain; charset=utf-8")
	//@ResponseBody
    public String getAdmission2017() {
		Iterable<ModelSystemView> modelSys=model_system_repo.findAll();
		modelSys.forEach(system->System.out.println(system));
        //model.addAttribute("users", null);
        return "modelSystemView";
		//return "users";
    }
	
	
	@RequestMapping(value = "systemview", method = RequestMethod.GET)
	//@ResponseBody
    public String getModelSystemView(Model model) {
		Iterable<ModelSystemView> modelSys=model_system_repo.findAll();
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(modelSys);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 System.out.println(json);
		model.addAttribute("objectList",json);
		//modelSys.forEach(system->System.out.println(system));
       
		//model.addAttribute("users", null);
        //return "modelSystemView";
		return "modelSystemView";
    }
	
	
}
