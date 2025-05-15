//3. Create an array of integers. Reverse the array using stack
package stack;
import java.util.Arrays;
import java.util.Stack;

public class ArrayReverse{
	public static void main(String[]args) {
		Stack<Integer> s1=new Stack<>();
	    int []arr= {1,2,3,4,5};
	    for(int ele :arr) {
	    	s1.add(ele);
	    }
	    for(int i=0;i<arr.length;i++) {
	    	arr[i]=s1.pop();
	    }
	    System.out.println("reverse array is"+Arrays.toString(arr));
	}
}