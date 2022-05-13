package com.skilldistillery.cardbase.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column (name="set_abbr")
	private String setAbbr;
	@Column (name="card_name")
	private String cardName;
	
	
	
	public Card() {}
	
	
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", setAbbr=" + setAbbr + ", cardName=" + cardName + "]";
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSetAbbr() {
		return setAbbr;
	}
	public void setSetAbbr(String setAbbr) {
		this.setAbbr = setAbbr;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
}
