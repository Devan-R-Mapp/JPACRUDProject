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
	private boolean legendary;
	@Column (name="card_type")
	private String cardType;
	@Column (name="card_subtype")
	private String cardSubType;
	@Column (name="card_text")
	private String cardText;
	@Column (name="image_link")
	private String image;
	private String color;
	@Column (name="set_postition")
	private String setPosition;
	private String rarity;
	private Integer cmc;
	private String mc;
	private Integer power;
	private Integer toughness;
	private Integer loyalty;
	
	
	
	
	
	public Card(String setAbbr, String cardName, boolean legendary, String cardType, String cardSubType,
			String cardText, String image, String color, String setPosition, String rarity, Integer cmc, String mc,
			Integer power, Integer toughness, Integer loyalty) {
		super();
		this.setAbbr = setAbbr;
		this.cardName = cardName;
		this.legendary = legendary;
		this.cardType = cardType;
		this.cardSubType = cardSubType;
		this.cardText = cardText;
		this.image = image;
		this.color = color;
		this.setPosition = setPosition;
		this.rarity = rarity;
		this.cmc = cmc;
		this.mc = mc;
		this.power = power;
		this.toughness = toughness;
		this.loyalty = loyalty;
	}



	public Card() {}
	
	
	
	@Override
	public String toString() {
		return "Card [id=" + id + ", setAbbr=" + setAbbr + ", cardName=" + cardName + ", cardType=" + cardType
				+ ", cardSubType=" + cardSubType + ", cardText=" + cardText + "]";
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



	public boolean getLegendary() {
		return legendary;
	}



	public void setLegendary(boolean legendary) {
		this.legendary = legendary;
	}



	public String getCardType() {
		return cardType;
	}



	public void setCardType(String cardType) {
		this.cardType = cardType;
	}



	public String getCardSubType() {
		return cardSubType;
	}



	public void setCardSubType(String cardSubType) {
		this.cardSubType = cardSubType;
	}



	public String getCardText() {
		return cardText;
	}



	public void setCardText(String cardText) {
		this.cardText = cardText;
	}



	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getSetPosition() {
		return setPosition;
	}



	public void setSetPosition(String setPosition) {
		this.setPosition = setPosition;
	}



	public String getRarity() {
		return rarity;
	}



	public void setRarity(String rarity) {
		this.rarity = rarity;
	}



	public Integer getCmc() {
		return cmc;
	}



	public void setCmc(Integer cmc) {
		this.cmc = cmc;
	}



	public String getMc() {
		return mc;
	}



	public void setMc(String mc) {
		this.mc = mc;
	}



	public Integer getPower() {
		return power;
	}



	public void setPower(Integer power) {
		this.power = power;
	}



	public Integer getToughness() {
		return toughness;
	}



	public void setToughness(Integer toughness) {
		this.toughness = toughness;
	}



	public Integer getLoyalty() {
		return loyalty;
	}



	public void setLoyalty(Integer loyalty) {
		this.loyalty = loyalty;
	}
	
	
}
