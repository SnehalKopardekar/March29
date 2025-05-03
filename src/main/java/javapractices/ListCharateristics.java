package javapractices;

import java.util.ArrayList;
import java.util.List;

public class ListCharateristics {

	public static void main(String[] args) {
		
		
		/*List l1 = new ArrayList<>();
		Hetrogenous objects are allowed but we never used in realtime
		l1.add(10);
		l1.add(20.5f);
		l1.add("Snehal");
		
		for(Object obj : 11) {
			System.out.println(((String)obj).length());
		}*/
		
		List <Integer> l1 = new ArrayList<Integer>();

		l1.add(10);
		l1.add(5);
		l1.add(100);
		l1.add(20);
		l1.add(9);
		l1.add(null);
		l1.add(100);
		
		System.out.println(l1);
		
		for(Integer i: l1) {
			System.out.println(i);
		}
		
	}

}
