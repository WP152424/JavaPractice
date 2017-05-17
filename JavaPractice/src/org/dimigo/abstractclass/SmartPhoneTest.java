package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone [] i= {
				new IPhone("iPhone 7","¾ÖÇÃ",900000),
				new Galaxy("°¶·°½Ã S8","»ï¼º",800000)
		};
		System.out.println(i[0]);
		i[0].turnOn();
		i[0].pay();
		i[0].useSpecialFunction();
		i[0].turnOff();
		
		System.out.println();
		System.out.println(i[1]);
		i[1].turnOn();
		i[1].pay();
		i[1].useSpecialFunction();
		i[1].turnOff();
		
		
	}

}
