package arrays;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		
        int[] arr = {5,2,8,3,1};
        Arrays.sort(arr);
        
        System.out.println("The second smallest integer is :"+arr[1]);
	}

}
