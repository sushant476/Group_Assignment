package DoublelyLinkedList;

 

public class Tester {
   public static void main(String[]args) {    
	   DoublelyLinkedList l1=new DoublelyLinkedList();
	   l1.addFirst(11);
	   l1.addFirst(12);
	   l1.addFirst(13);
	   l1.addFirst(14);
	   l1.addFirst(15);
	   System.out.print("list:");
	   l1.display();
	   System.out.println();
	   System.out.print("list in reverse order:");
	   l1.displayReverse();
    	 
   }
}
