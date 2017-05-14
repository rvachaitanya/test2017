package afterGoldManRoundOne;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arrlist = {2,5,4,1,9};
		secondLargest(arrlist);
	
	}

	private static void secondLargest(int[] arrlist) {
		// TODO Auto-generated method stub
		//Arrays.sort(arrlist);
		//System.out.println(arrlist[1]);
		int temp=0;
		int largestNum =-1;
		int secondLargest = -2;
		for (int i = 0; i < arrlist.length; i++) {
			if(arrlist[i]>largestNum){
				System.out.println(arrlist[i]+"  " +largestNum);
				temp = largestNum;
				largestNum = arrlist[i];
				secondLargest = temp;
			}
		}
		int temp1=0;
		int smallest =100000;
		int secondSmallest = 9999 ;
		for (int i = 0; i < arrlist.length; i++) {
			if(arrlist[i]<smallest){
				System.out.println(arrlist[i]+"  " +smallest);
				temp = smallest;
				smallest = arrlist[i];
				secondSmallest = temp;
			}
		}
		System.out.println(secondLargest);
		System.out.println(secondSmallest);
		
	}
	
}
