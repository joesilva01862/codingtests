package com.kyle.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsCode {

	private void addItems(int[] items, List<Integer> list) {
		for (int item : items) {
			list.add(item); // autoboxing implicit here
		}
	}
	
	// To print collections, I could use an iterator, but in current versions
	// of Java, I can simply use a "for each" loop and achieve the same thing.
	private void printCollection(String header, Collection<Integer> list) {
		System.out.println(header);
		for (Integer number : list) {
			System.out.println("Number: "+number);
		}
	}
	
	
	// I insert an array of random integers into the first 2 collections
	// rather than using a "for" loop, to show that an ArrayList 
	// collection doesn't sort the entries in any way 
	public void createTwoCollections() {
		// collection to hold numbers from 1 thru 10
		List<Integer> collection1 = new ArrayList<Integer>();
		int[] array1 = new int[] {3,1,2,5,4,10,7,6,9,8};
		addItems(array1, collection1);
		
		// collection to hold numbers from 6 thru 15
		List<Integer> collection2 = new ArrayList<Integer>();
		int[] array2 = new int[] {15,13,6,14,11,10,7,12,9,8};
		addItems(array2, collection2);

		// "Now print both collections"
		// print collection 1
		printCollection("Collection holding 1 thru 10:", collection1);
		
		// now print collection 2
		printCollection("Collection holding 6 thru 15:", collection2);
		
		// "print the size of both collections"
		System.out.println("size of collection 1 thru 10: " + collection1.size());
		System.out.println("size of collection 6 thru 15: " + collection2.size());
		
		// Combine both collections into a third, with no duplicates
		// I chose a HashSet here because it doesn't allow for duplicates and 
		// entries are automatically sorted.
		// When an attempt to add a duplicate entry is made, the implementation
		// simply returns false.
		TreeSet<Integer> collection3 = new TreeSet<Integer>();
		for (Integer number : collection1) {
			collection3.add(number);
		}
		for (Integer number : collection2) {
			collection3.add(number);
		}
		
		printCollection("Collection with no duplicates:", collection3);
		
		// "remove the middle entry"
		int midEntry = collection3.size() / 2;
		
		// I chose to use an iterator here because it works regardless
		// of the content of the collection
		int count = 0;
		for (Iterator<Integer> iterator = collection3.iterator(); iterator.hasNext();) {
		    iterator.next();
		    if (count == midEntry) {
		        iterator.remove();
		    }       
		    count++;
		}
		
		// "print collection in reverse order"
		// Note: We have a few options on how to do that. For example, we could simply obtain
		// another Set by invoking collection3.descendingSet(), but that wouldn't work in all cases,
		// that's why I decided to use the technique below.
		List<Integer> list = new ArrayList<Integer>(collection3);
		Collections.sort(list, Collections.reverseOrder());
		// a LinkedHashSet preserves the order of the list, which is now reverse ordered
		Set<Integer> coll3Reversed = new LinkedHashSet<Integer>(list); 
		printCollection("\nCollection 3 in reverse order:", coll3Reversed);
		
		// "print the size of the collection"
		System.out.println("Size of collection 3 after middle entry removed: "+coll3Reversed.size());
		
		// "Define a collection that contains a key/value pair"
		// Note: My understanding of this part of the test is to create a structure that's able to
		// hold a number of key-value pairs with no duplicates. A Map is the right data structure to 
		// satisfy that requirement. If the goal was to create a list of key-value pairs to allow
		// duplicates, I'd have to use a different trick such as making the "value" of that Map a List
		// and create logic to detect the key duplication and add its value to the list.
		Map<Integer, String> mapColl = new HashMap<Integer, String>();
		
		// "add 5 key/value pairs to the collection
		mapColl.put(1, "My number 1");
		mapColl.put(2, "My number 2");
		mapColl.put(3, "My number 3");
		mapColl.put(4, "My number 4");
		mapColl.put(5, "My number 5");
		
		// "add a duplicate key"
		mapColl.put(3,  "My number 3");
		
		// "check for duplicate key and print key if found"
		if (mapColl.containsKey(3)) {
			System.out.println("Found duplicate key 3: "+ mapColl.get(3));
		}
		
		// "print the key/value pairs"
		for (Integer item : mapColl.keySet()) {
			System.out.println("key "+ item + ", value "+mapColl.get(item));
		}
		
		// "print the size of the collection"
		System.out.println("Size of the Map collection: "+mapColl.size());
	}
	
	public static void main(String[] args) {
		CollectionsCode collCode = new CollectionsCode();
		collCode.createTwoCollections();
	}
}
