package week3day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] variables = {2,4,5,7,9,4,6,1,2,4,};
		
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = new HashSet<Integer>();
	
		for (int i = 0; i < variables.length; i++) {
				boolean original = unique.add(variables[i]);
				if (!original) {
					duplicates.add(variables[i]);
				}
		System.out.println(unique);					// remove duplicates
		System.out.println(variables);				// display only duplicates
		}
	}

}