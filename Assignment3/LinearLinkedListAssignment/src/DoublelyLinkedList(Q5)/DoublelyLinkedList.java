package DoublelyLinkedList;

public class DoublelyLinkedList {
	private Node head;
	private Node tail;
    static class Node{
    	private int data;
    	private Node next;
    	private Node prev;
    	public Node() {
    		next=null;
    		prev=null;
    	}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
    }
    public DoublelyLinkedList() {
    	head=null;
    	tail=null;
    }
    public void addFirst(int value) {
    	Node newNode=new Node();
    	newNode.setData(value);
    	if(head==null) {
    		head=newNode;
    		tail=newNode;
    	}else {
    		head.prev=newNode;
        	newNode.next=head;
        	
        	head=newNode;
    	}
    }
    public void addLast(int value) {
    	Node newNode=new Node();
    	newNode.setData(value);
    	Node trav=head;
    	while(trav.next!=null) {
    		 
    		trav=trav.next;
    	}
    	if(head==null) {
    		head=newNode;
    		tail=newNode;
    	}else {
    		trav.next=newNode;
    		newNode.prev=trav;
    	}
    	
    }
    public void display() {
    	Node trav=head;
    	while(trav!=null) {
    		System.out.print(" "+trav.getData());
    		trav=trav.next;
    	}
    	
    }
     
	 
	 
	 //5. Display Doubly linear linked list in reverse order.
    public void displayReverse() {
    	Node trav=tail;
    	while(trav!=null) {
    		System.out.print(" "+trav.getData());
    		trav=trav.prev;
    	}
    	
    }
}
 