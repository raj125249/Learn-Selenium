package week3day2;

import java.util.ArrayList;
import java.util.List;

public class Learnlist {

	public static void main(String[] args) {
	//Declare a list || Arraylist
		//ArrayList<Integer> marks = new ArrayList<Integer>();--> can view no of arraylist.
		
		List<Integer> marks = new ArrayList<Integer>();// can view only few list.
		
		marks.add(21);// index=0
		marks.add(22);
		marks.add(23);
		marks.add(24);
		marks.add(25);
		marks.add(26);// index=5
		
		List<Integer> phoneno = new ArrayList<Integer>();
		
		phoneno.add(60);
		phoneno.add(10);
		phoneno.add(20);
		phoneno.add(30);
		phoneno.add(40);
		phoneno.add(50);
		
	//add method
		System.out.println(marks);
		
	//addall method
		System.out.println(marks.addAll(phoneno));
		
	//getmethod
		System.out.println(marks.get(4));
		
	//remove method
		System.out.println(marks.remove(3));
		
	// instead of length, size method is used in list
		System.out.println(marks.size());					
		
	// removeall method
		System.out.println(marks.removeAll(phoneno));
		
	//clear method  void no output
		phoneno.clear();
	
		System.out.println(marks);
		
	//convert to an array
		System.out.println(marks.toArray());
	}
}
