package opss_concepts;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
 /* TreeMap is implemented based on red-black tree structure
	It is sorted by keys
	Methods: put, get, containsKey, containsValue, replace, remove, clear, keySet, values, entrySet
	firstEntry, lastEntry, firstKey, lastKey, pollFirstEntry, pollLastEntry 
	*/

		var tree = new TreeMap<Character,Integer>();
		
		tree.put('d', 1000);
		tree.put('b', 2000);
		tree.put('a', 1000);
		tree.put('c', 9000);
		
		System.out.println(tree.containsValue(9000));
		
		tree.put('a', 2000); // here put and replace doing same thing
		tree.replace('b', 2000);
		
		System.out.println(tree.firstEntry());
		System.out.println(tree.lastEntry());
		System.out.println(tree.firstKey());
		System.out.println(tree.lastKey());
		
//		System.out.println(tree.pollFirstEntry()); // show and delete it also
//		System.out.println(tree.pollLastEntry());
		
		System.out.println(tree);
		
//		Iterating on Tree map using for loop
		
//		for(Entry<Character,Integer> e : tree.entrySet()) {
//			System.out.println(e);
//		}
		
//		Iterating on Tree map using iterator
		
		Iterator itr = tree.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
