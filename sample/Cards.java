package com.sirius.sample;

public class Cards {
	
		public Cards(){}
		int cardno;
		int balance;
		int password;
		boolean active;
		public Cards(int cardno, int balance, int password,boolean active) {
			super();
			this.cardno = cardno;
			this.balance = balance;
			this.password = password;
			this.active=active;
		}
		public int getCardno() {
			return cardno;
		}
		public void setCardno(int cardno) {
			this.cardno = cardno;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		
		
	}


