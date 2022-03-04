package com.sirius.sample;

public class Menu {
String bank;
Admin[] admin;

Customers[] customers;
public Customers[] getCustomers() {
	return customers;
}
public void setCustomers(Customers[] customers) {
	this.customers = customers;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public Admin[] getAdmin() {
	return admin;
}
public void setAdmin(Admin[] admin) {
	this.admin = admin;
}


}
