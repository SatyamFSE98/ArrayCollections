package twopairs;
import java.util.HashSet;
import java.util.Set;

public class HashSetApproach {
	
	public static void findPairHashSet(int arr[],int target) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int num:arr) {
			
			int compliment = target-num;
			if(set.contains(compliment)) {
				System.out.println("pair is found"+num+" ,"+compliment);
			}
			set.add(num);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1,45,6,10,4,8};
		int targetSum =16;
		
		findPairHashSet( arr,targetSum);
		
	}

}
