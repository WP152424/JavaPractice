package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		String name="������";
		boolean isMale=false;
		int age=25; 
		double height=161.8;
		float weight=44.3f;
		char bloodType='A';
		System.out.println("<<������ ������>>");
		System.out.println("�̸� : "+name);
		System.out.println("���� : " +  (isMale ? "����":"����"));
		System.out.println("���� : "+age +" ��");
		System.out.println("Ű : "+height+" cm");
		System.out.println("������ : "+weight+" kg");
		System.out.println("������ : "+bloodType+" ��");
	}
}
