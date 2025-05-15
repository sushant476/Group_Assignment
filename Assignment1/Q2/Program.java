//2. Implement descending stack (Initialize top = SIZE - 1)

package stack;

import java.util.Scanner;

public class Program {
    
   public static void main(String[]args) {
	   Scanner in=new Scanner(System.in);
	   Stack s1=new Stack(5);
	   int choice=0;
   	  do {
   		System.out.println("1.push\n 2.pop\n 3.peak\n 0.exit");
   		System.out.print("Enter your choice:");
   		choice=in.nextInt();
   		switch(choice) {
   		  case 1:
   			System.out.print("Enter the element you want to push:");
   			s1.push(in.nextInt());
   			break;
   		  case 2:
   			int pop=s1.pop();
   			System.out.println("poped element is "+pop);
     			break;
   		  case 3:
   			System.out.println("peak element is "+s1.peak());
     			break;
     		  default:
     			  System.out.println("something went wrong");
   		}
   	}while(choice!=0);
   	  
   	  
   }
}
