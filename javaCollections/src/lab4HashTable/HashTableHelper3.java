package lab4HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableHelper3 implements Runnable {
	Hashtable<String,Integer> ht;

	public HashTableHelper3(Hashtable<String,Integer> ht) {
		this.ht = ht;
		new Thread(this, "HashTableHelper3").start();
	}

	public void run() {
		ht.put("three", 3);
		try {
			System.out.println("HashTableHelper3 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}


