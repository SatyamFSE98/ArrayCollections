package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseUsingJava8 {
	
	
	public static void reverseUsingJava8(int[] array) {
		
		IntStream.range(0, array.length/2).forEach(i->{
			int temp = array[i];
			array[i]=array[array.length-i-1]; //last element arr[i];
			array[array.length-i-1]= temp;
		});
		
		System.out.println("The reversed array is:"+Arrays.toString(array));
		
	}

	public static void main(String[] args) {
	
      
		 int[] array = {1,2,3,4,5};
		 reverseUsingJava8(array);
	}

}
