package lab6Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestArray2 {

	public static void main(String[] args) {
		Integer[] array = { 1, 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        Set<Integer> uniqueSet = new HashSet<>(Arrays.asList(array));

	    for (Integer temp : uniqueSet) {
	    	if(Collections.frequency(Arrays.asList(array), temp)>1) {

	        System.out.println("Duplicate element found :" + temp + " but " + Collections.frequency(Arrays.asList(array), temp)+ " times");
	    	}
	    }
	}
}
