package org.dimigo.oop;

public class PiggyBank {

	private static int balance=0;
	public static void putMoney(FamilyMember member, int amount) {
		balance+=amount;
		System.out.println(member.getMemberName() +" : "+ amount+"�� ����");
	}
	public static void printBalance() {
		System.out.println("���������� �� �ݾ� : "+balance+"��");
	}
}
