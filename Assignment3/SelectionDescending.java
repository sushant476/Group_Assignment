//1. Modify the insertion sort algorithm to sort the array in descending order-
import java.util.Arrays;

public class SelectionDescending{
   public static void main(String[]args) {
	   int []arr= {22,11,33,55,44};
	   System.out.println("before sorting:"+Arrays.toString(arr));
	   sort(arr);
	   System.out.println("after sorting:"+Arrays.toString(arr));
	   
   }

   static void sort(int[] arr) {
	 
	 for(int i=0;i<arr.length-1;i++) {
		 int minIndex=i;
		 for(int j=i;j<=arr.length-1;j++) {
			 if(arr[j]<arr[minIndex]) {
				 minIndex=j;
			 }
		 }
		 int temp=arr[i];
		 arr[i]=arr[minIndex];
		 arr[minIndex]=temp;
		 
	 }
	
   }
}
