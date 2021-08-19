package lab9LinkedList;

class Node
{ 
    int data;
    Node next;
}
public class LinkedList {
	 Node head;

	    public void addFirst(int val)
	    {
	        Node newNode = new Node();
	        newNode.data = val;
	        newNode.next = head;

	        head = newNode;
	    }
	    
	    public void addLast(int val)
	    {
	        Node newNode = new Node();
	        newNode.data = val;
	        newNode.next = null;

	        if(head == null)
	            head = newNode;
	        else
	        {
	            Node lastNode = head;

	            while(lastNode.next != null)
	            {
	                lastNode = lastNode.next;
	            }

	            lastNode.next = newNode;
	        }
	    }
	    
	    
	    public void delete(int key)
	    {
	        if(head.data == key)
	        {
	            head = head.next;
	        }
	        else
	        {
	            Node temp = head;

	            while(temp.next != null)
	            {
	                if(temp.next.data == key)
	                {
	                    temp.next = temp.next.next;
	                    break;
	                }
	                else
	                    temp = temp.next;
	            }
	        }
	    }

	    public boolean search(int key)
	    {
	        Node temp = head;

	        while(temp != null)
	        {
	            if(temp.data == key)
	                return true;
	            temp = temp.next;
	        }

	        return false;
	    }
	    
	  	    public void print()
	    {
	        Node temp = head;

	        while(temp != null)
	        {
	            System.out.println(temp.data);
	            temp = temp.next;
	        }
	    }

	    public static void main(String args[])
	    {

	          LinkedList list = new LinkedList();

	          //add First
	          list.addFirst(10);
	          list.addFirst(20);
	          list.addFirst(30);
	          list.addFirst(40);
	          System.out.println("The LinkedList Elements Are:");
	          list.print();
	          
	          //add last
	          list.addLast(10);
	          list.addLast(20);
	          list.addLast(30);
	          list.addLast(40);
	          System.out.println("The LinkedList Elements Are:");
	          list.print();
	          
	          //delete Element
	          System.out.println("Deleting Element: "+30);
	          list.delete(30);
	          System.out.println("The LinkedList Elements Are [After Deletion]:");
	          list.print();

	          
	          //search Node
	          if(list.search(30))
	              System.out.println("Search Found");
	          else
	              System.out.println("Search Not Found");

	          System.out.println("Searching Element: "+100);
	          if(list.search(100))
	              System.out.println("Search Found");
	          else
	              System.out.println("Search Not Found");

	          
	    }
	}