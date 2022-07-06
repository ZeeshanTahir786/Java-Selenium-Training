package opss_concepts;

import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHash_Set {

	public static void main(String[] args) {
	 /* A Linked HashSet is an ordered version of HashSet ( maintain a doubly linked list internally)
		LinkedHashSet maintains a doubly-linked List across all elements
		No positional access of elements 
		Basic Methods: add, remove, clear, contains, size,
		IMP: Union and Intersection of Sets 
		IMP: Convert set to list */
		
		
		var set = new LinkedHashSet<Character>();
		
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		
		System.out.println(set);
		
		for(Character x :set) {
			System.out.println(x);
		}
	}

}
