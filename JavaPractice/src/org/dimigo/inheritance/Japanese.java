package org.dimigo.inheritance;

public class Japanese extends Person {

	public Japanese(String name) {
		super(name);
	}
	public void sayHello() {
		System.out.println("�����̿�");
	}
	public void sayBye() {
		System.out.println("��䳪��");
	}
	public String toString() {
		return "���� �Ϻ���� "+getName()+"�Դϴ�.";
	}
}
