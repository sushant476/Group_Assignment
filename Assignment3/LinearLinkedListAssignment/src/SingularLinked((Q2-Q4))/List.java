package SingularLinked;

public class List {
	private Node head;
    static class Node{
    	private int data;
    	private Node next;
    	public Node() {
    		next=null;
    	}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
    }
    public List() {
    	head=null;
    }
    public void addFirst(int value) {
    	Node newNode=new Node();
    	newNode.setData(value);
    	if(head==null) {
    		head=newNode;
    	}else {
    		
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
    	}else {
    		trav.next=newNode;
    	}
    	
    }
    public void addPosition(int value,int pos) {
    	Node newNode=new Node();
    	newNode.setData(value);
    	Node trav=head;
    	if(pos==1) {
    		addFirst(value);
    	}
    	for(int i=1;i<pos-1 && trav.next!=null;i++) {
    		trav=trav.next;
    	}
    	newNode.next=trav.next;
    	trav.next=newNode;
    }
    public void display() {
    	Node trav=head;
    	while(trav!=null) {
    		System.out.print(" "+trav.getData());
    		trav=trav.next;
    	}
    	
    }
	public void deleteFirst() {
		// TODO Auto-generated method stub
		if(head!=null) {
			head=head.next;
		}
		
	}
	public void deleteLast() {
		// TODO Auto-generated method stub
		if(head.next==null) {
			head=null;
		}
		Node trav=head;
		while(trav.next.next!=null) {
   		 
    		trav=trav.next;
    	}
		trav.next=null;
		
	}
	//2. In singly linear list implement following operations.
    //	insert a new node after a given node
    //	insert a new node before a given node
	public void insertAfter(Node n1,int value) {
		Node newNode=new Node();
    	newNode.setData(value);
    	Node trav=head;
    	while(trav.next!=null) {
    		if(trav.getData()==n1.getData()) {
    			break;
    		}
    		trav=trav.next;
    	}
    	newNode.next=trav.next;
    	trav.next=newNode;
	}
    public void insertBefore(Node n1,int value) {
    	Node newNode=new Node();
    	newNode.setData(value);
    	Node trav=head;
    	while(trav.next!=null) {
    		if(trav.next.getData()==n1.getData()) {
    			break;
    		}
    		trav=trav.next;
    	}
    	newNode.next=trav.next;
    	trav.next=newNode;
	}
//  Q3.Display Singly linear linked list in reverse order.
    public void displayInReverse() {
    	reverse(head);
    }
	private void reverse(Node head) {
		// TODO Auto-generated method stub
		if(head==null) {
			return;
		}
		Node trav=head;
    	
    		reverse(trav.next);
    		System.out.print(" "+trav.getData());
    	 
		
	}
//	4. Write a function which will insert values in sorted order into linked list.
	public void insertInSortedOrder(int value) {
		Node newNode=new Node();
    	newNode.setData(value);
		if(head==null) {
			head=newNode;
			return ;
		}
		else if(head.next==null) {
        	if(head.data>value) {
        		addFirst(value);
        	}else {
        		addLast(value);
        	}
        	return ;
        }
		Node trav=head;
		Node pre=head;
    	while(trav!=null && trav.data<value) {
    	    pre=trav;
    		trav=trav.next;
    	}
    	if(pre==head) {
    		addFirst(value);
    		return ;
    	}
    	newNode.next=pre.next;          
    	pre.next=newNode;
	}
    
}
 