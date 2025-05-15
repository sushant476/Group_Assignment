//Implement linear search algorithm to find the nth occurence //of the given element. If nth occurrence is
not found, return -1.
public class LinearNthOccurence {
	 public static void main(String[]args) {
		   int[]arr= {45,45,12,23,34,45,34,23,23,45};
		   int key=45;
		   System.out.println("nth occurence of key:"+search(arr,key,5));
	   }

	   static int search(int[] arr, int key,int n) {
		 int index=-1;
		 int occurence=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==key) {
				 occurence++;
				 if(occurence==n) {
					 index=i;
					 break;
				 }
				
			 }
		 }
		 return index;
	   }
}
