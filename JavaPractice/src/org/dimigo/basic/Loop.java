package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int ka=100;
		
		String[] caw={"������","����","���","���"};
			do{
				System.out.println("--------------------");
				System.out.println("<<���� �޴�>>");
				System.out.println("1.���ݷ� ����");
				System.out.println("2.���ݷ� ����");
				System.out.println("3.ĳ���� ����");
				System.out.println("9.����");
				System.out.println("--------------------");
				System.out.printf("�޴� �Է� => ");
				a = scanner.nextInt();
				if(a==1) {
					ka=ka+10;
					System.out.printf("���ݷ��� �����Ǿ����ϴ�. ���� ���ݷ� : %d\n",ka);
					
					
				}
				if(a==2) {
					ka=ka-10;
					System.out.printf("���ݷ��� ���ҵǾ����ϴ�. ���� ���ݷ� : %d\n",ka);
					
				}
				if(a==3) {
					int num = new Random().nextInt(4);
					if(num==0){
						System.out.println(caw[0]+"(��)�� �����Ǿ����ϴ�.");
					}
					if(num==1){
						System.out.println(caw[1]+"(��)�� �����Ǿ����ϴ�.");
					}
					if(num==2){
						System.out.println(caw[2]+"(��)�� �����Ǿ����ϴ�.");
					}
					if(num==3){
						System.out.println(caw[3]+"(��)�� �����Ǿ����ϴ�.");
					}
					;
				}
				if(a!=1&&a!=2&&a!=3&&a!=9) {
					System.out.println("���� �޴��Դϴ�!!");
					
				}
			}while(a!=9);
			System.out.println("���� �����ϼ���!");
	}

}
