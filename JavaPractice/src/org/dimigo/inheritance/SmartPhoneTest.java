package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		IPhone i = new IPhone("iPhone 7","����",900000);
		Galaxy g = new Galaxy("������ S8","�Ｚ",800000);
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
