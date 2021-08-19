package lab4Synchronization;

import java.util.HashMap;
import java.util.Map;

public class MainClassHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		MapHelper1 mapHelper1 = new MapHelper1(hashMap);
		MapHelper2 mapHelper2 = new MapHelper2(hashMap);
		MapHelper3 mapHelper3 = new MapHelper3(hashMap);
		MapHelper4 mapHelper4 = new MapHelper4(hashMap);

		for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
			hashMap.put("abc", 5);
		}

	}
}
