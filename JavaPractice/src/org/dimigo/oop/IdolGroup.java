package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		int i,j;
		String[] groupName={"���","2NE1","�ɽ�����"};

		String[][] memberName={
				{"GD","�¾�","�뼺","ž","�¸�"},
				{"CL","��ٶ��","�ں�","����"},
				{"����","����","����","�ξ�"}
		};
		
		for(i=0;i<3;i++) {
			System.out.println("<<"+groupName[i]+">>");
			for(j=0;j<memberName[i].length;j++) {
				System.out.println(memberName[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
