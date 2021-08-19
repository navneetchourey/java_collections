package lab10SyncArrayList;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ListHelper1 implements Runnable {
	List<String> list;

	public ListHelper1(List<String> list) {
		this.list = list;
		new Thread(this, "ListHelper1").start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		list.add("a");
		try {
			System.out.println("ListHelper1 sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}


}


