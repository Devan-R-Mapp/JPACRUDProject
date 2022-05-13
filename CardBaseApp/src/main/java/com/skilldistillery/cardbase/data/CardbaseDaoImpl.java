package com.skilldistillery.cardbase.data;

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
		// TODO Auto-generated method stub
		return em.find(Card.class, cardid);
	}

	@Override
	public List<Card> findAllCards() {
		String SQL = "Select c from Card c";
		return em.createQuery(SQL, Card.class).getResultList();
	}

}
