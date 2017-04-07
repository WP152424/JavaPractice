package org.dimigo.oop;

public class Snack {

	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack() {
		
	}
	
	public Snack(String name, String company, int price,int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	
	
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	public int getNumber() {
		return number;
	}
	public void setName(String newName) {
		name = newName;
		
	}
	public void setCompany(String newCompany) {
		company = newCompany;
		
	}
	public void setPrice(int newPrice) {
		price = newPrice;
		
	}
	public void setNumber(int newNumber) {
		number = newNumber;
		
	}
	
	public int calcPrice() {
		return price*number;
	}
	
	public String toString(){
		return "�̸� : " + name  +"\n������ : "+company+"\n���� : "+ String. format("%,d", price)+"��\n���� : "+number+"��";
	}
	
	
}



