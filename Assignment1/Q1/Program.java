//1. Write program to implement linear queue in which front and rear starts at 0.

package com.sushant;

import java.util.Scanner;

public class Program {
    public static void main(String[]args) {
    	Scanner in =new Scanner(System.in);
     Queue q1=new  Queue(5);
    
    	
    	int choice=0;
    	do {
    		System.out.println("1.push\n 2.pop\n 3.peak\n 0.exit");
    		System.out.print("Enter your choice:");
    		choice=in.nextInt();
    		switch(choice) {
    		  case 1:
    			System.out.print("Enter the element you want to push:");
    			q1.push(in.nextInt());
    			break;
    		  case 2:
    			int pop=q1.pop();
    			System.out.println("poped element is "+pop);
      			break;
    		  case 3:
    			System.out.println("peak element is "+q1.peak());
      			break;
      		  default:
      			  System.out.println("something went wrong");
    		}
    	}while(choice!=0);
    }
}
