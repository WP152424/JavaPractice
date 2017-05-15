package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		IPhone i = new IPhone("iPhone 7","¾ÖÇÃ",900000);
		Galaxy g = new Galaxy("°¶·°½Ã S8","»ï¼º",800000);
		System.out.println(i);
		i.turnOn();
		i.pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println();
		System.out.println(g);
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
		
		
	}

}
