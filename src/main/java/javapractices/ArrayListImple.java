package javapractices;

import java.util.ArrayList;

public class ArrayListImple {
	
	public static void main(String[] args) {
		
			ArrayList<Integer> arraylist= new ArrayList<Integer>();
			
			arraylist.add(10);
			arraylist.add(5);
			arraylist.add(7);
			arraylist.add(20);
			arraylist.add(100);
			arraylist.add(null);
			arraylist.add(5);
			
			System.out.println(arraylist);
			
			for(int i =0;i<arraylist.size();i++) {
				System.out.println(arraylist.get(i));
			}
			
	}

}
