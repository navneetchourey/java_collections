package lab10SyncArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	
	public static void main(String[] args) {
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("a");
		namesList.add("b");
		namesList.add("c");
		
		//add, remove - we don't need explicit synchronization
		// to fetch/traverse the values from this list - we have to use explicit synchronization
		/*
		 * synchronized (namesList) { Iterator<String> it = namesList.iterator();
		 * while(it.hasNext()){ System.out.println(it.next()); } }
		 */
		
		Iterator<String> itrr = namesList.iterator();
		while(itrr.hasNext()){
			System.out.println(itrr.next());
		}
		
		//2. Its a class : Thread-safe/synchronized already
		CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<>();
		empList.add("a");
		empList.add("b");
		empList.add("c");
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		// we don't need any explicit synchronization for any operation: add/remove/traverse
		
	}

}
