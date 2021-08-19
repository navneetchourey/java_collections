package lab4Synchronization;

import java.util.Map;

public class MapHelper3 implements Runnable {
	Map<String, Integer> map;

	public MapHelper3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "MapHelper3").start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		map.put("three", 3);
		try {
			System.out.println("MapHelper3 sleeping");
			Thread.sleep(100);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}


