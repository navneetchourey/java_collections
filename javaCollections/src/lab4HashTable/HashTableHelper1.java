package lab4HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableHelper1 implements Runnable {
	Hashtable<String,Integer> ht;

	public HashTableHelper1(Hashtable<String,Integer> ht) {
		this.ht = ht;
		new Thread(this, "HashTableHelper1").start();
	}

	public void run() {
		ht.put("One", 1);
		try {
			System.out.println("HashTableHelper1 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}


