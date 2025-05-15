//Implement binary search algorithm if array is sorted in descending order.
import java.util.Arrays;

public class Binary {
   public static void main(String[]args) {
	   int[]arr= { 76,65,54,43,32};
	   
	    
	   System.out.println("element is found at index:" +search(arr,43));
   }

   static int search(int[] arr,int key) {
	 int start=0;
	 int end=arr.length-1;
	 int mid=0;
	 while(start<=end) {
		 mid=(start+end)/2;
		 if(arr[mid]<key) {
			 end=mid-1;
		 }else if(key<arr[mid]) {
			 start=mid+1;
		 }else {
			 return mid;
		 }
	 }
	 return -1;
   }
}
