package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class MelonChart {

	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("����?","��Ͼ�"));
		System.out.println("-- << ��� íƮ >> --");
		printList(list);
		System.out.println();
		
		list.add(1,new Music("SIGNAL","Ʈ���̽�"));
		System.out.println("-- <<  2�� �� �߰� >> --");
		printList(list);
		System.out.println();
		
		list.set(2,new Music("�ȷ�Ʈ","������"));
		System.out.println("-- <<  3�� �� ���� >> --");
		printList(list);
		System.out.println();
		
		list.remove(1);
		System.out.println("-- <<  2�� �� ���� >> --");
		printList(list);
		System.out.println();
		
		list.clear();
		System.out.println("-- << ��ü ����Ʈ ���� >> --");
		

		
	}
	public static void printList(List<Music> list) {
		int i=1;
		for(Music a : list) {
			System.out.println(i+"."+a);
			i++;
		}
	}

}
