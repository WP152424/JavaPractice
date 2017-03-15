package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int mo = 1700000;
		int so = 3; 
		int dos = 1500;
		
		System.out.println("<<디미베네 연산 인건비>>");
		String.format("%,d\n",mo );
		System.out.println("월 평균 급여 : "+String.format("%,d",mo )+"원");
		System.out.println("점포 내 직원 수 : "+String.format("%,d",so )+"명");
		System.out.println("점포 수 : "+String.format("%,d",dos )+"개\n");
		System.out.println("연간 인건비 : "+String.format("%,d",(long)so*dos*(mo*12))+"원");

	}

}
