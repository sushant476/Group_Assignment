package com.sushant;

public class Queue {
   private int[]arr;
   private int rear;
   private int front;
   private int 	SIZE;
   public Queue(int size){
	   SIZE=size;
	   arr=new int[SIZE+1];
	   front =rear=0;
   }
   public void push(int value) {
	   if(isFull()) {
		   System.out.println("queue is Full");
		   return;
	   }else {
		   rear++;
		   arr[rear]=value;
	   }
	   
   }
   public int pop() {
	   if(isEmpty()) {
		   System.out.println("queue is empty");
		   
	   }else {
		   front++;
		   return arr[front];
	   }
	   return -1;
   }
   public int peak() {
	   if(isEmpty()) {
		   System.out.println("queue is empty");
		   
	   }else {
		   return arr[front+1];
	   }
	    return -1;
	   
   }
   public boolean isEmpty() {
	   if(front==rear) {
		   return true;
	   }
	   return false;
   }
   public boolean isFull() {
	   if(rear==SIZE) {
		   return true;
	   }
	   return false;
   }
}
