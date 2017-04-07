package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		Snack snack = new Snack("»õ¿ì±ø","³ó½É",1100,2);
		System.out.println(snack.toString()+"\n");
		Snack snack2 = new Snack("ÄÜ¯…","Å©¶ó¿î",1200,1);
		System.out.println(snack2.toString()+"\n");
		Snack snack3 = new Snack("Çã´Ï¹öÅÍÄ¨","ÇØÅÂ",1500,4);
		System.out.println(snack3.toString()+"\n");
		
		System.out.println("ÃÑ ±¸¸Å ±Ý¾× : "+String.format("%,d",snack.calcPrice()+snack2.calcPrice()+snack3.calcPrice())+"¿ø");
	}

}
