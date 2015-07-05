package com.isfotstone.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.isfotstone.mode.Contact;

@Controller
@SessionAttributes
public class ContactController {

	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") Contact contact,
			BindingResult bindingResult, HttpServletRequest request) {
		List<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact);
		request.setAttribute("contactList", contactList);
		return "contacts"; // contacts.jsp
	}
	
	@RequestMapping("/inputContact")
	public ModelAndView inputContact(){
		return new ModelAndView("contact");  // contact.jsp
	}

}
