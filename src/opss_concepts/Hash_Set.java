package opss_concepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hash_Set {

	public static void main(String[] args) {
		/*
		Set is a Collection that cannot contain duplicate elements. 
		HashSet does not maintain insertion order 
		No positional access of elements 
		Basic Methods: add, remove, clear, contains, size, 
		IMP: Union and Intersection of Sets 
		IMP: Convert set to list. */
		
		
		var set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(60);
		
		
		System.out.println(set1);
		
		var set2 = new HashSet<Integer>();
		
		set2.add(10);
		set2.add(80);
		set2.add(90);
		set2.add(60);
		set2.add(15);
		set2.add(66);
		
		set1.addAll(set2);  // For union of 2 sets
//		set1.retainAll(set2); // for intersection of two sets
		
//		Convert set to list.
		
		var list = new ArrayList<Integer>();
		
		list.addAll(set1);
		
		System.out.println(set1);
		System.out.println(list);
		
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
