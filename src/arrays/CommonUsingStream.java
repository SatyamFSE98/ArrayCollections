package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonUsingStream {

	public static void fetchCommanElement(int[] arr1,int[] arr2) {
		
		List<Integer> commonElement =Arrays.stream(arr1).filter(number->Arrays.stream(arr2).anyMatch(arr2Number->arr2Number==number))
				.boxed().collect(Collectors.toList());
		
		System.out.println("The common element in both the array are:"+commonElement );
		
	}
	
	   	public static void main(String[] args) {
		
		
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,4,6,7,8};
		
		fetchCommanElement( arr1, arr2);
		
		

}
}