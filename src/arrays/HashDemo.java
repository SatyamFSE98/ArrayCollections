package arrays;

import java.util.HashSet;

public class HashDemo {
	
	
	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<Integer>();
		
		num.add(1);
		num.add(7);
		num.add(5);
		num.add(6);
		
		num.stream().sorted();
		for(int i: num ) {
			System.out.println(i);
		}
	}

}
