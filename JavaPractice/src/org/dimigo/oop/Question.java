package org.dimigo.oop;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		String[] question = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
		String[] answers= {"방탄소년단","남주혁","응용 프로그래밍"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("1."+question[0]);
		String answer1 = scanner.nextLine();
		
		
		if(answers[0].equals(answer1)) {
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
		
		
		System.out.println("2."+question[1]);
		String answer2 = scanner.nextLine();
		if(answers[1].equals(answer2)) {
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
		
		
		System.out.println("3."+question[2]);
		String answer3 = scanner.nextLine();
		if(answers[2].equals(answer3)) {
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("틀렸습니다!");
		}
		
		
		System.out.println("<<결과 출력>>");
		System.out.println(question[0]+" "+answers[0]+"입니다.");
		System.out.println(question[1]+" "+answers[1]+"입니다.");
		System.out.println(question[2]+" "+answers[2]+"입니다.");
	}
	
}
