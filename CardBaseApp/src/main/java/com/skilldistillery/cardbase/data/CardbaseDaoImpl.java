package com.skilldistillery.cardbase.data;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.cardbase.entities.Card;

@Service
@Transactional
public class CardbaseDaoImpl implements CardBaseDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Card findById(int cardid) {
		return em.find(Card.class, cardid);
	}

	@Override
	public List<Card> findAllCards() {
		String SQL = "Select c from Card c order by c.setPosition";
		return em.createQuery(SQL, Card.class).getResultList();
	}

	@Override
	public Card createCard(Card card) {
		 em.persist(card);
		return card;
	}

	@Override
	public Card updateCard(Card newCard ) {
		Card updatedcard = em.find(Card.class, newCard.getId());
//		updatedcard.setSetAbbr(newCard.getSetAbbr());
		updatedcard.setCardName(newCard.getCardName());
		updatedcard.setLegendary(newCard.getLegendary());
		updatedcard.setCardType(newCard.getCardType());
		updatedcard.setCardSubType(newCard.getCardSubType());
		updatedcard.setCardText(newCard.getCardText());
		updatedcard.setImage(newCard.getImage());
		updatedcard.setColor(newCard.getColor());
		updatedcard.setSetPosition(newCard.getSetPosition());
		updatedcard.setRarity(newCard.getRarity());
		updatedcard.setCmc(newCard.getCmc());
		updatedcard.setMc(newCard.getMc());
		updatedcard.setPower(newCard.getPower());
		updatedcard.setToughness(newCard.getToughness());
		updatedcard.setLoyalty(newCard.getLoyalty());
		
		
		
		
		return updatedcard;
	}

	@Override
	public boolean deleteCard(Card card) {
		try {
		em.remove(card);
		} catch (Exception e) {
			
		}
		return false;
	}

}
 