package org.dimigo.inheritance;

public class PersonTest2 {

	public static void main(String[] args) {
		Person[] persons = {
				new Person("Tom"),
				new Korean("È«±æµ¿"),
				new Japanese("´Ù³ªÄ«"),
				new Chinese("¿Õ¹Ö")
		};

		for(Person person : persons) {
			greeting(person);
		}
		
	}
	private static void greeting(Person person) {
		System.out.println(person);
		person.sayHello();
		person.sayBye();
		System.out.println();
	}
}
