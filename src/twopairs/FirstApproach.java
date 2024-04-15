package twopairs;

import java.util.Arrays;

public class FirstApproach {
	
	 
	
	 public static void findPair(int[] arr,int targetSum) {
		 
		 Arrays.sort(arr);   //{1,4,6,8,10,45} arrays will sort here
		 
		 int left =0; //index 0
		 int right =arr.length-1; //index 5
		 
		 while(left<right) {
			 int currentsum = arr[left]+arr[right];
			 if(currentsum==targetSum) {
				 System.out.println("The pair is["+arr[left]+" "+arr[right]+"]");
				 left++;
				 right--;
			 }else if(currentsum<targetSum) {
				 
				 left++;
			
			 }else {
				 right--;
			 }
		 }
	 }
	
	public static void main(String[] args) {
		
		int[] arr = {1,45,6,10,4,8};
		int targetSum =14;
		
		findPair( arr,targetSum);
		
	}

}
