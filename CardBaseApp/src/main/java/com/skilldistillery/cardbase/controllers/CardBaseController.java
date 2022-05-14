package com.skilldistillery.cardbase.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.cardbase.data.CardBaseDAO;
import com.skilldistillery.cardbase.entities.Card;

@Controller
public class CardBaseController {

	@Autowired
	private CardBaseDAO dao;

	@RequestMapping(path = { "/", "home.do" })
	public String index() {
		return "index"; // if using a ViewResolver.
	}
	
	@RequestMapping(path = { "/", "createCard.do" })
	public String gotocreate() {
		return "card/create";
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("cards", dao.findAllCards());
		return "index";
	}

	@RequestMapping("getCard.do")
	public String showFilm(@RequestParam Integer fid, Model model) {
		Card card2 = dao.findById(fid); // find the film
		model.addAttribute("card", card2); // adds an object called "film" witht the information of film
		return "card/show";
	}

	
	
	
}
