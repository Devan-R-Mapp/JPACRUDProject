package com.skilldistillery.cardbase.data;

import java.util.List;

import com.skilldistillery.cardbase.entities.Card;

public interface CardBaseDAO {

	Card findById(int cardid);
	List<Card> findAllCards();
	Card createCard(Card card);
	Card updateCard(Card card2);
	boolean deleteCard(Card card);
}
