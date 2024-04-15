package twopairs;

public class BruteForceAlgo {
 
	
	private static void findPairBruteForce(int[] arr, int targetSum) {
     
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]+arr[j]==targetSum) {
					 System.out.println("Found Pair:["+arr[i]+","+arr[j]+"]");
				 }
				 
			 }
		 }
		
	}

	public static void main(String[] args) {
		int[] arr = {1,45,6,10,4,8};
		int targetSum =16;
		
		findPairBruteForce( arr,targetSum);
		

	}

	
}
