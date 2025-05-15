//to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//no. of ele's less than or equal to x (including x).
Input: { 10, 20, 15, 3, 4, 4, 1 }
Ouput: Rank of 4 is: 4
public class RankOfElement {
  public static void main(String[]args) {
	  int[]arr={ 10, 20, 15, 3, 4, 4, 1 };
	  System.out.println("rank of element:"+rank(arr,4));
	  
  }

  public static int rank(int[] arr,int ele) {
	// TODO Auto-generated method stub
	int rank=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<=ele) {
			rank++;
		}
	}
	return rank;
  }
}
