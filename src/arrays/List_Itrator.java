package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_Itrator {

	public static void main(String[] args) {
		/* * List Iterator is used when we want to enumerate elements of List 
		 * * It can be used both on ArrayList and LinkedList * Methods: 
		 * * next, hasNext, previous, hasPrevious, 
		 * * nextIndex, previousIndex, add, set, remove */
		
		var list = new ArrayList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		
	    ListIterator<Double> itr = list.listIterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
	    System.out.println("====================");
	    ListIterator<Double> itr1 = list.listIterator(list.size());
	    
	    while(itr1.hasPrevious()) {
	    	System.out.println(itr1.previous());

	    }
	    System.out.println("====================");
	    
//		write a program to remove all null values from ArrayList
	    
	var list1 = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(null);
		list1.add(5);
		list1.add(null);
		list1.add(999);
		list1.add(345);
	    
	    ListIterator<Integer> itr2 = list1.listIterator();

		
	    while(itr2.hasNext()) {
	    	if(itr2.next() == null) {
//	    		itr2.remove();
	    		itr2.set(0);
	    	}
	    }
	    System.out.println(list1);
		
	    System.out.println("====================");
	    
//	    Update all OOD numbers from linked list to even numbers
	    
	    var list2 = new LinkedList<Integer>();

	    list2.add(11); 
	    list2.add(23); 
	    list2.add(100);
	    list2.add(30);
	    list2.add(111);
	    list2.add(119); 
	    list2.add(20);
	    
	    
	    ListIterator<Integer> itr3 = list2.listIterator();
	    
	    while(itr3.hasNext()) {
	    	int i = (int)itr3.next();
	    	if(i % 2 == 1) {
	    		i++;
	    		itr3.set(i);
	    	}
	    	
	    }
	    System.out.println(list2);
	}

}
