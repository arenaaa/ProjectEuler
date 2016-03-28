package P0004;

import java.util.ArrayList;
import java.util.Iterator;

public class AboutIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("X");
		list.add("M");
		list.add("B");
		/*
		 * 1. 
		 */
		Iterator<String> itr = list.iterator();
		while ( itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
		// int [] xx = .. ;
		// xx.length
		/*
		 * 2. 
		 */
		for ( String value : list) { // forEach구문이라고 합니다. Iterator와 완전히 똑같아요.
			System.out.println(value);			
		}
		/*
		 * 3.
		 */
		for ( int i = 0 ; i < list.size(); i++) {
			String value = list.get(i);
			
		}
	}
}
