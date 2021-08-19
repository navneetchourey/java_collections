package lab5List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketerSort implements Comparable<CricketerSort> {
	int runs;
	String name;

	public CricketerSort(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}

	@Override
	public String toString() {
		return name + " " + runs;
	}

	@Override
	public int compareTo(CricketerSort that) {
		if (this.runs > that.runs) {
			return 1;
		}
		if (this.runs < that.runs) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {

		List<CricketerSort> cricketers = new ArrayList<CricketerSort>();
		cricketers.add(new CricketerSort("Bradman", 9996));
		cricketers.add(new CricketerSort("Sachin", 14000));
		cricketers.add(new CricketerSort("Dravid", 12000));
		cricketers.add(new CricketerSort("Ponting", 11000));
		System.out.println(cricketers);
		Collections.sort(cricketers);
		System.out.println(cricketers);
	}

}
