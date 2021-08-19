package lab4HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableHelper4 implements Runnable {
	Hashtable<String,Integer> ht;

	public HashTableHelper4(Hashtable<String,Integer> ht) {
		this.ht = ht;
		new Thread(this, "HashTableHelper4").start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		ht.put("four", 4);
		try {
			System.out.println("HashTableHelper4 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}


