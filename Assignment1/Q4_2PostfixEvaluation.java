package stack;

import java.util.Stack;

public class PostfixEvaluation {
   public static void main(String[]args) {
	   String str="40 50 60 * 30 / + 90 + 70 -";
	   
	   int result=evaluation(str);
	   System.out.println("ans:"+result);
   }

   static int evaluation(String expr1) {
	 Stack<Integer> s=new Stack<>();
	 String []expr=expr1.split(" ");
	 for(int i=0;i<expr.length;i++) {
		 //extract character at ith index
		 String ele=expr[i];
		 //check if it is digit or operator
		 try {
			 int el=Integer.parseInt(ele);
			 s.push(el);
		 }catch(Exception e) {
			 int op2=s.pop();
			 int op1=s.pop();
			 int result=calculate(op1,op2,ele);
			 s.add(result);
		 }
		   //if character is a operator-then pop two operands from stack .do operation on them
		 
	 }
	   
	 return s.pop() ;
   }

   static int calculate(int op1, int op2, String ele) {
	   switch(ele) {
	     case "+":
	    	return op1+op2;
	    	 
	     case "-":
		    return op1-op2;
		    
	     case "*":
			    return op1*op2;
	     case "/":
			    return op1/op2;
	   }
	   return 0;
   }
}
