package opss_concepts;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		/* HashMap provides the basic implementation of Map interface
		It stores data in Key and Value pairs
		We can access a value using the corresponding key
		Methods: put, get, contains Key, remove, clear, keySet, values, entrySet */
		
		
		var map = new HashMap<Integer,String>();
		
		map.put(4, "Hafiz");
		map.put(3, "ZEESHAN");
		map.put(2, "Tahir");
		map.put(1, "Naseer");
		
		
		System.out.println(map.get(2));
		
		System.out.println(map.containsKey(3));
		
		map.put(3, "TAHIR");
//		
//		map.remove(2);
//		map.remove(4,"Naseer");
		
//		map.clear();
		
		var setOfKeys = map.keySet();
		var setOfValues = map.values();
		var setOfEntries = map.entrySet();
		
		System.out.println(setOfKeys);
		System.out.println(setOfValues);
		System.out.println(setOfEntries);
		
		System.out.println(map);

	}

}
