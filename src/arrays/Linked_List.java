package arrays;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		/*  LinkdList implements List Interface.
		 *  * LinkedList elements are linked together using pointers.
		 *  * Supported Methods: 
		 *  * 1. Accessing Elements - Add, Get, Update, Remove, Clear 
		 *  * 2. Searching Elements - Index Of, Contains, 
		 *  * 3. Viewing portion of list - SubList 
		 *  * 4. Iterating over list 
		 *  * 5. Size, toArray, is Empty 
		 *  * 6. Peek and Poll Methods */

		var list = new LinkedList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		
		System.out.println(list.get(1));
		list.set(1, 1.112);
		
//		list.clear();
//		list.remove(1);
		
		System.out.println(list.contains(1.2));		
		System.out.println(list.indexOf(1.112));
		
		System.out.println(list.subList(2, 5));
		
		System.out.println(list.size());
		System.out.println(list.toArray()[0]);
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.peekFirst());
		System.out.println(list.peekLast());
		System.out.println(list.pollFirst());
		
		for(Double x : list) {
			System.out.println(x);
		}
		System.out.println(list);
	
		
	}

}
