package lab10SyncArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainClassArrayList {

	public static void main(String[] args) {

//		CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<>();
		List<String> list = new ArrayList<String>();
		List<String> namesList = Collections.synchronizedList(list);
		/*
		 * List<String> namesList = Collections.synchronizedList(list);
		 * CopyOnWriteArrayList<String> empList= new CopyOnWriteArrayList<>();
		 */

//		Map<String, Integer> syncMap = Collections.synchronizedMap(hashMap);
		ListHelper1 listHelper1 = new ListHelper1(namesList);
		ListHelper2 listHelper2 = new ListHelper2(namesList);
		ListHelper3 listHelper3 = new ListHelper3(namesList);
		ListHelper4 listHelper4 = new ListHelper4(namesList);

		/*
		 * Iterator<String> itr = list.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next()); list.add("e"); }
		 */

		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				namesList.add("e");
				System.out.println(it.next());
			}
		}

	}
}
