package lab10SyncArrayList;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ListHelper3 implements Runnable {
	List<String> list;

	public ListHelper3(List<String> list) {
		this.list = list;
		new Thread(this, "ListHelper3").start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		list.add("c");
		try {
			System.out.println("ListHelper3 sleeping");
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}



}


