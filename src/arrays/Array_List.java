package arrays;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		/* 
		 * *ArrayList implements List Interface. 
		 * * ArrayList supports creation of dynamic arrays. 
		 * * Supported Methods:
		 * * 1. Accessing Elements - Add, Get, Update, Remove, Clear 
		 * * 2. Searching Elements Index Of, Contains, 
		 * * 3. Viewing portion of list - SubList 
		 * * 4. Iterating over list 
		 * * 5. Size, toArray, isEmpty
		 * */
		ArrayList<String> arr = new ArrayList<String>(); 
		arr.add("Red");
		arr.add("Green");
		arr.add("Yellow");
		arr.add("Black");
		arr.add("Pink");
		arr.add("Black");

		System.out.println(arr.get(1));
		arr.set(1, "Cyan");
		System.out.println(arr.get(1));
//		arr.clear();
		
		
		arr.remove(0);
		arr.remove("Pink");
		
		System.out.println(arr.indexOf("Black"));
		System.out.println(arr.lastIndexOf("Black"));

		System.out.println(arr.contains("Yellow"));
		
		System.out.println(arr.subList(1, 3));
		
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		
		System.out.println(arr);
		
		for(String x: arr) {
			System.out.print(x);
		}
	}

}
