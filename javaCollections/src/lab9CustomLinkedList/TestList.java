package lab9CustomLinkedList;

public class TestList {

	public static void main(String[] args) {
		 CustomLinkedList customLinkedList = new CustomLinkedList();
	     customLinkedList.add(5);
	     customLinkedList.add(10);
	     customLinkedList.add(15);
	     customLinkedList.add(20);
	     customLinkedList.display();
	     customLinkedList.addAtIndex(2, 100);
	     System.out.println("********");
	     customLinkedList.display();
	     System.out.println("********");
	     customLinkedList.deleteNodeAt(2);
	     customLinkedList.display();
	     System.out.println("********");
	     customLinkedList.insertHead(50);
	     customLinkedList.display();
	}
}
