package com.skilldistillery.cardbase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.cardbase.data.CardBaseDAO;

@Controller
public class CardBaseController {

	@Autowired
	private CardBaseDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index(Model model) {
		model.addAttribute("DEBUG", dao.findById(1));

		return "index"; // if using a ViewResolver.
	}
}
