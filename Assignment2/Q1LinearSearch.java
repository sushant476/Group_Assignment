//1. Write a linear search algorithm to return index of last occurance of key.
public class linearSearch {
   public static void main(String[]args) {
	   int[]arr= {45,12,23,34,45,34,23,23};
	   int key=45;
	   System.out.println("last occurence of key:"+search(arr,key));
   }

   static int search(int[] arr, int key) {
	 int index=-1;
	 for(int i=arr.length-1;i>=0;i--) {
		 if(arr[i]==key) {
			 index=i;
			 break;
		 }
	 }
	 return index;
   }
}
