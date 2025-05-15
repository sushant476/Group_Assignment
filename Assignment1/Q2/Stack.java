package stack;

public class Stack {
   private int[]arr;
   private int size;
   private int top;
   public Stack(int size) {
	   this.size=size;
	   arr=new int[size];
	   top=size;
   }
   public void push(int value) {
	   if(isFull()) {
		   System.out.println("stack is full");
	   }else {
		   top--;
		   arr[top]=value;
	   }
   }
   public int pop() {
	   int temp=-1;
	   if(isEmpty()) {
		   System.out.println("stack is empty");
	   }else {
		   temp=arr[top];
		   top++;
	   }
	   return temp;
	   
   }
   public int peak() {
	   int temp=-1;
	   if(isEmpty()) {
		   System.out.println("stack is empty");
	   }else {
		   temp=arr[0];
		    
	   }
	   return temp;

   }
    boolean isEmpty() {
	  // TODO Auto-generated method stub
      if(top==size) {
    	  return true;
      }
	  return false;
    }
    boolean isFull() {
     if(top==0) {
    	 return true;
     }
	 return false;
   }
}
