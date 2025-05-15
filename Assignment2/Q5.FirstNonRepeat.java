//find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3
import java.util.Arrays;

public class FirstNonRepeat {
	public static void main(String[]args) {
		   int []arr= { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		   System.out.println("before sorting:"+Arrays.toString(arr));
		   Arrays.sort(arr);
		   System.out.println("after sorting:"+Arrays.toString(arr));
		   
		   System.out.println("first non repeat is "+first(arr));
		   
	}

	public static int first(int[] arr) {
		// TODO Auto-generated method stub
		int temp=-1;
		int preRepeated=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]== preRepeated) {
				continue;
			}
			if(arr[i]==arr[i+1]) {
				preRepeated=arr[i];
				continue;
			}
			temp=arr[i];
		}
		return temp;
	}
	
}
