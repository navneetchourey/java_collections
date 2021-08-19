package lab9CustomLinkedList;

import java.util.HashMap;
import java.util.Map;

import lab9LinkedList.Node;

public class CustomLinkedList<E> {
    
   

    private Node head;

    public CustomLinkedList(){
    }
    
    public void add(int data){
    	Node newNode = new Node(data);
    	if(this.head == null){
    		head = newNode;
    	}else {
    		Node currentNode = head;
    		while(currentNode.getNextNode() != null){
    			currentNode = currentNode.getNextNode();
    		}
    		currentNode.setNextNode(newNode);
    	}
    }
    
    public void insertHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(head);
        head = newNode;
}
    
    public void addAtIndex(int index, int data){
        Node nodeToBeInserted = new Node(data);
        Node node = head;
        for(int i = 0; i< index -1; i++){
            node = node.getNextNode();
        }
        nodeToBeInserted.setNextNode(node.getNextNode());
        node.setNextNode(nodeToBeInserted);
    }

    
    public void deleteNodeAt(int index){
        Node node = head;
        for(int i = 0; i< index -1; i++){
            node = node.getNextNode();
        }
        node.setNextNode(node.getNextNode().getNextNode());
    }

    public void display(){
        if(head != null){
            Node currentNode = head;
            while(currentNode.getNextNode() != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }
    
    public Node reverse(){
        Node previous = null;
        Node current = head;
        Node next;
        while (current != null){
            next = current.getNextNode();
            current.setNextNode(previous);
            previous = current;
            current = next;
        }
        return previous;
    }
    
	
}
