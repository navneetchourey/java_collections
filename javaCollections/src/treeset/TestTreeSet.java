package treeset;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestTreeSet {
	public static void main(String[] args) {
		// Define an objects of TreeSet class
		/*
		 * TreeSet<Car> set = new TreeSet<Car>(( e1,e2) -> { e1. } );
		 */

		// Creating Car objects
		TreeSet<Car> set = new TreeSet<>(
				(e1, e2) -> e1.getStock() > e2.getStock() ? 1 : e1.getStock() < e2.getStock() ? -1 : 0);
		Car c1 = new Car(132, "BMW", "Rajkot", 35);
		Car c2 = new Car(269, "Audi", "Surat", 20);
		Car c3 = new Car(560, "Kia", "Vadodara", 15);
		Car c4 = new Car(109, "Creta", "Ahmedabad", 26);

		// Adding Car objects to TreeSet
		set.add(c1);
		set.add(c2);
		set.add(c3);
		set.add(c4);
//		Collections.sor
//		set.stream().collect(Collectors.co)

		// Traversing TreeSet
		for (Car c : set) {
			System.out.println(c.stock + " " + c.name + " " + c.city + " " + c.Modelno);
		}

	}
}
