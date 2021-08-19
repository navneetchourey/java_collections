package lab10SyncArrayList;

import java.util.Hashtable;
import java.util.List;

public class ListHelper2 implements Runnable {
	List<String> list;

	public ListHelper2(List<String> list) {
		this.list = list;
		new Thread(this, "ListHelper2").start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		list.add("b");
		try {
			System.out.println("ListHelper2 sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}


