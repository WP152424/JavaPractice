package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> ballad = new ArrayList<>();
		List<Music> dance = new ArrayList<>();
		System.out.println("-- <<��� �帣�� íƮ>> --");
		ballad.add(new Music("�ȷ�Ʈ","������"));
		dance.add(new Music("I LUV IT","PSY"));
		dance.add(new Music("����?","��Ͼ�"));
		map.put("�߶��",ballad);
		map.put("��", dance);
		printMap(map);
		System.out.println();
		
		System.out.println("-- <<�� 2���� ����>> --");
		dance.remove(1);
		dance.add(new Music("SIGNAL","Ʈ���̽�"));
		printMap(map);
		System.out.println();
		
		System.out.println("-- <<�� 1���� ����>> --");
		dance.remove(0);
		printMap(map);
		System.out.println();
		
		System.out.println("-- <<��ü ����Ʈ ����>> --");
		dance.clear();
		printMap(map);
		


	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()){
			System.out.println("[" + key + "]");
			int i = 1;
			for(Music m : map.get(key)){
				System.out.print(i + ". ");
				System.out.println(m.toString());
				i++;
		}
		}
	}
}
