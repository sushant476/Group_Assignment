package SingularLinked;

import DoublelyLinkedList.List;
import DoublelyLinkedList.List.Node;

public class Tester {
   public static void main(String[]args) {
//	   List l1=new List();
//	   l1.addFirst(10);
//	   l1.addFirst(20);
//	   l1.addFirst(30);
//	   l1.addFirst(40);
//	   
////	   l1.deleteFirst();  
////	   l1.deleteLast();
//	    
//	   l1.addPosition(45,1);
//	   l1.addPosition(54,4);
//	   
//	  
//	   Node newNode=new Node();
//   	   newNode.setData(40);
//   	   l1.insertBefore(newNode,564);
//   	   System.out.print("display:");
//    	l1.display();
//    	System.out.println();
//    	System.out.print("display in reverse:");
//   	   l1.displayInReverse();
	   List l2=new List();
	   l2.insertInSortedOrder(12);
	   l2.insertInSortedOrder(12);
	   l2.insertInSortedOrder(11);
	   l2.insertInSortedOrder(15);
	   l2.insertInSortedOrder(15);
	   l2.insertInSortedOrder(15);
	   l2.insertInSortedOrder(13);
	   l2.insertInSortedOrder(14);
	   l2.insertInSortedOrder(17);
	   l2.insertInSortedOrder(18);
	   l2.insertInSortedOrder(2);
	   l2.insertInSortedOrder(2);
	   l2.insertInSortedOrder(2);
	   l2.insertInSortedOrder(2);
	   l2.insertInSortedOrder(34);
	   l2.insertInSortedOrder(19);
	   l2.display();
    	 
   }
}
