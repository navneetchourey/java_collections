package lab4HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import lab4Synchronization.MapHelper1;
import lab4Synchronization.MapHelper2;
import lab4Synchronization.MapHelper3;
import lab4Synchronization.MapHelper4;

public class MainClassHashTable {

	public static void main(String[] args) {
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();

//		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
		HashTableHelper1 mapHelper1 = new HashTableHelper1(ht);
		HashTableHelper2 mapHelper2 = new HashTableHelper2(ht);
		HashTableHelper3 mapHelper3 = new HashTableHelper3(ht);
		HashTableHelper4 mapHelper4 = new HashTableHelper4(ht);

		for (Map.Entry<String, Integer> e : ht.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
			ht.put("abc", 10);
		}

	}
}
