package lab6Array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestArray {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };
//		int[] array = { 8,7,8,3,1, 1, 2, 3, 4, 5, 6 };
//		int[] array = {7,2,6,1,4,7,4,5,4,7,7,3,1};

		System.out.println("\nExample 3 - Count all with Map");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int temp : array) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		printMap(map);

		System.out.println("\nSorted Map");
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(map);
		printMap(treeMap);
	}

	public static void printMap(Map<Integer, Integer> map) {

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println("Duplicate element found : " + entry.getKey() + " but " + entry.getValue() +" times");
			}
		}

	}
}
