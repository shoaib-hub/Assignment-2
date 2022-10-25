package day_2;

import java.util.TreeSet;

public class RetreiveNRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> mySet = new TreeSet<Integer>();
		   
		  mySet.add(10);
		  mySet.add(30);
		  mySet.add(50);
		  mySet.add(40);
		  mySet.add(20);
	 
	 System.out.println("Original tree set: "+mySet);
	 System.out.println("Removes the first element: "+mySet.pollFirst());
	 System.out.println("Tree set after removing first element: "+mySet);

	}

}

// output :
//Original tree set: [10, 20, 30, 40, 50]
//		Removes the first element: 10
//		Tree set after removing first element: [20, 30, 40, 50]

