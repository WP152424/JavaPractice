package org.dimigo.oop;

public class SnackTest {

	public static void main(String[] args) {
		Snack snack = new Snack("�����","���",1100,2);
		System.out.println(snack.toString()+"\n");
		Snack snack2 = new Snack("�ܯ�","ũ���",1200,1);
		System.out.println(snack2.toString()+"\n");
		Snack snack3 = new Snack("��Ϲ���Ĩ","����",1500,4);
		System.out.println(snack3.toString()+"\n");
		
		System.out.println("�� ���� �ݾ� : "+String.format("%,d",snack.calcPrice()+snack2.calcPrice()+snack3.calcPrice())+"��");
	}

}
