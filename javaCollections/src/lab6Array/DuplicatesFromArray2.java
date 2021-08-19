package lab6Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesFromArray2 {

	public static void main(String args[]) {
		
		List list = new ArrayList<>(10);
		list.add(20,"abc");
		
		
		int[] withDuplicates = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 }; 
		Set<Integer> duplicates = findDuplicates(withDuplicates);
		System.out.println("input array is : " + Arrays.toString(withDuplicates)); 
		System.out.println("Duplicate elements found in array are : " + duplicates); 	
		
		Integer[] duplicateEmelents = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 }; 
		getDuplicates(duplicateEmelents); } 
	/** * Complexity of this solution is O(n^2) */
	
	public static Set<Integer> findDuplicates(int[] input) {
		Set<Integer> duplicates = new HashSet<Integer>();
		for (int i = 0; i < input.length; i++) {
			for (int j = 1; j < input.length; j++) {
				if (input[i] == input[j] && i != j) { 
					// duplicate element found 
					duplicates.add(input[i]); break;
					}
				} 
			}
		return duplicates;
		} 
	/** * Generic method to find duplicates in array. Complexity of this method is * O(n) because we are using HashSet data structure. @return */
	
	public static <Integer extends Comparable<Integer>> void getDuplicates(Integer[] array) {
		Set<Integer> dupes = new HashSet<Integer>();
		for (Integer i : array) { if (!dupes.add(i)) { 
			System.out.println("Duplicate element in array is : " + i); 
			}
		}
		}
			
	

}
