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

	@RequestMapping(path = { "/", "home.do" }, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("cards", dao.findAllCards());
		return "index";
	}

	@RequestMapping(path = {"addACardToTheDatabase.do"}, method = RequestMethod.POST)
	public String addACard(Card card, Model model) {
		Card cardCreated = dao.createCard(card);
		model.addAttribute("card", cardCreated);
		return "card/createdCard";
	}
//	@RequestMapping(path = {"addACardToTheDatabase.do"}, method = RequestMethod.POST)
//	public String addACard(@RequestParam String setAbbr, String cardName, boolean legendary, String cardType, String cardSubType,
//			String cardText, String image, String color, String setPosition, String rarity, Integer cmc, String mc,
//			Integer power, Integer toughness, Integer loyalty, Model model) {
//		Card cardCreated = new Card(setAbbr, cardName, legendary, cardType, cardSubType, cardText, image, color, setPosition, rarity, cmc, mc, power, toughness, loyalty);
//		dao.createCard(cardCreated);
//		model.addAttribute("card", cardCreated);
//		return "card/createdCard";
//	}
	
	
	@RequestMapping("getCard.do")
	public String showFilm(@RequestParam Integer fid, Model model) {
		Card card2 = dao.findById(fid); // find the film
		model.addAttribute("card", card2); // adds an object called "film" witht the information of film
		return "card/show";
	}

	
	
	
}
