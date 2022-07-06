package opss_concepts;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
	 /* TreeSet is an important implementation of the Sorted Set interface
		Elements are sorted in ascending order by default
		No positional access of elements
		Basic Methods: add, remove, clear, contains, size,
		IMP: Union and Intersection of Sets
		IMP: Convert set to list	*/

		var set = new TreeSet<String>();
		
		set.add("Hafiz");
		set.add("Zeeshan");
		set.add("Tahir");
		set.add("Naseer");
		set.add("Attari");
		
		System.out.println(set);
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
