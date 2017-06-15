package org.dimigo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;

public class ArakoMenu {

	public static void main(String[] args) {

		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			Writer writer = new BufferedWriter(new FileWriter("files/menu.txt"));
			BufferedReader reader = new BufferedReader(new FileReader("files/menu.txt"))){
			
			String str;
			
			while((str=br.readLine())!=null){
				writer.write(str+"\n");
			}
			writer.flush();
			System.out.println("<< �޴� ��� >>");

			while((str=reader.readLine())!=null){
				System.out.println(str);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
