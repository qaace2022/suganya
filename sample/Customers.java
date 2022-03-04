package com.sirius.sample;

public class Customers {
	String name;
	int id;
	Cards[] cards;
	public Customers() {}
	public Customers(String name, int id, Cards[] card) {
		super();
		this.name = name;
		this.id = id;
		this.cards = card;
		
	}


	public Customers(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cards[] getCards() {
		return cards;
	}
	public void setCards(Cards[] cards) {
		this.cards = cards;
	}
	
	
}
    	

	

