package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int mo = 1700000;
		int so = 3; 
		int dos = 1500;
		
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		String.format("%,d\n",mo );
		System.out.println("�� ��� �޿� : "+String.format("%,d",mo )+"��");
		System.out.println("���� �� ���� �� : "+String.format("%,d",so )+"��");
		System.out.println("���� �� : "+String.format("%,d",dos )+"��\n");
		System.out.println("���� �ΰǺ� : "+String.format("%,d",(long)so*dos*(mo*12))+"��");

	}

}
