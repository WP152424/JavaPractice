package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String[] question = {"���� �����ϴ� ������?","���� �����ϴ� ����?","���� �����ϴ� ������?"};
		String[] answers= {"��ź�ҳ��","������","���� ���α׷���"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("1."+question[0]);
		String answer1 = scanner.nextLine();
		
		
		if(answers[0].equals(answer1)) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}
		
		
		System.out.println("2."+question[1]);
		String answer2 = scanner.nextLine();
		if(answers[1].equals(answer2)) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}
		
		
		System.out.println("3."+question[2]);
		String answer3 = scanner.nextLine();
		if(answers[2].equals(answer3)) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}
		
		
		System.out.println("<<��� ���>>");
		System.out.println(question[0]+" "+answers[0]+"�Դϴ�.");
		System.out.println(question[1]+" "+answers[1]+"�Դϴ�.");
		System.out.println(question[2]+" "+answers[2]+"�Դϴ�.");
	}
	
}
