package arrays;

public class CommonBruteForce {  //my logic
	
	
	 public static void commonBruteforce(int[] array1,int[] array2) {
		 
		 
		 for(int i=0;i<array1.length;i++) {
			 for(int j=0;j<array2.length;j++) {
				 if(array1[i]==array2[j]) {
					 
					 System.out.println("this number is common in both array is:"+array1[i]);
					 
				 }
			 }
		 }
	 }

	public static void main(String[] args) {
		
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {4,5,6,7,8};
		commonBruteforce( array1,array2);
		

	}

}
