package org.dimigo.abstractclass;

public class IPhone extends SmartPhone{

	public IPhone() {
		
	}
	public IPhone(String model,String company,int price) {
		super(model,company,price);
	}
	public void pay() {
		System.out.println("���� ���̷� �����մϴ�.");
	}
	public void useAirDrop() {
		System.out.println("AirDrop ����� ����մϴ�.");
	}
}
