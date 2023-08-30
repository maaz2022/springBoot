package com.maaz.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maaz.model.LoginModel;
import com.maaz.model.Person;


@Controller
@RequestMapping("/login")
public class LoginController {
    
    @GetMapping("/") 
    public String displayLoginForm(Model model) {
        model.addAttribute("loginModel", new LoginModel());
        return "loginform"; 
    }
    
    @PostMapping("/processlogin") 
    public String processLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("loginModel", loginModel);
            return "loginform"; 
        }
        model.addAttribute("loginModel", loginModel);
        return "loginresult"; 
    }
    @GetMapping("/person")
    public String display(Model model){
    	ArrayList<Person> PeopleList= new ArrayList<Person>();
    	
    	PeopleList.add(new Person(0,20,"Maaz",65f));
    	PeopleList.add(new Person(1,20,"nazeer",65f));
    	PeopleList.add(new Person(2,20,"gujjar",65f));
    	PeopleList.add(new Person(3,20,"ggorci",65f));
    	PeopleList.add(new Person(4,20,"Maaz",65f));
    	System.out.println(PeopleList);
    	
    	model.addAttribute("people", PeopleList);
    	return "printdata.html";
    }
}

