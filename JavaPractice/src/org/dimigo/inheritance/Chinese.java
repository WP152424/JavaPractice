package org.dimigo.inheritance;

public class Chinese extends Person {
	
	public Chinese(String name) {
		super(name);
	}
	public void sayHello() {
		System.out.println("���Ͽ�");
	}
	public void sayBye() {
		System.out.println("¹���");
	}
	public String toString() {
		return "���� �߱���� "+getName()+"�Դϴ�.";
	}

}
