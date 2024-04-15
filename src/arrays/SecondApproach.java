package arrays;

import java.util.Arrays;

public class SecondApproach {
	
	public static void fetchSecondSmallest(int arr[]) {
		
		
		int SecondSmallestElement = Arrays.stream(arr).distinct().sorted().skip(1).findFirst().orElseThrow(()-> new IllegalArgumentException("Array does not have second smallest element"));
		System.out.println("Second smallest element is:"+SecondSmallestElement);
	}
	
	
	public static void main(String[] args) {
		
		 int[] arr = {5,2,8,3,1,1};
		 
		 fetchSecondSmallest(arr);
	}

}
