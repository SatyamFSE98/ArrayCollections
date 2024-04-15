package arrays;

import java.util.Arrays;

public class ArraysSorting {
	
	public static void main(String[] args) {
		int arr[]= {1,4,5,2,7};
		int num =5;
		Arrays.sort(arr);
		System.out.println("maximum number is"+arr[4]);
	   for(int i:arr) {
		   System.out.print(i+" ");
	   }
	   
	   for(int i:arr) {
		   if(i==num) {
		     System.out.print("number founded successfuly and the number is"+num);
		   }
	   }
	   System.out.println("the even number are:");
	   for(int i:arr) {
		   if(i%2==0) {
			   System.out.print(i+" ");
		   }
	   }
	   System.out.println("the even number are:");
//	   Arrays.stream(arr).filter(i->i%2==0).forEach(i->System.out.print(i+" "));   
	   
	   Arrays.stream(arr).sum();
	   
       
	   int max=Integer.MIN_VALUE;
	   for(int i:arr) {
		   if(i>max) {
			   max=i;
		   }
	   }
	   System.out.println(max);
	   
	   int sum=0;
	   for(int i:arr) {
		  sum = sum+i;
	   }
	   System.out.println("the sum is"+sum);
	}

}
