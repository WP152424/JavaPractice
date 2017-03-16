package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int ka=100;
		
		String[] caw={"마법사","영주","기사","농민"};
			do{
				System.out.println("--------------------");
				System.out.println("<<게임 메뉴>>");
				System.out.println("1.공격력 증가");
				System.out.println("2.공격력 감소");
				System.out.println("3.캐릭터 설정");
				System.out.println("9.종료");
				System.out.println("--------------------");
				System.out.printf("메뉴 입력 => ");
				a = scanner.nextInt();
				if(a==1) {
					ka=ka+10;
					System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n",ka);
					
					
				}
				if(a==2) {
					ka=ka-10;
					System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n",ka);
					
				}
				if(a==3) {
					int num = new Random().nextInt(4);
					if(num==0){
						System.out.println(caw[0]+"(으)로 설정되었습니다.");
					}
					if(num==1){
						System.out.println(caw[1]+"(으)로 설정되었습니다.");
					}
					if(num==2){
						System.out.println(caw[2]+"(으)로 설정되었습니다.");
					}
					if(num==3){
						System.out.println(caw[3]+"(으)로 설정되었습니다.");
					}
					;
				}
				if(a!=1&&a!=2&&a!=3&&a!=9) {
					System.out.println("없는 메뉴입니다!!");
					
				}
			}while(a!=9);
			System.out.println("이제 공부하세요!");
	}

}
