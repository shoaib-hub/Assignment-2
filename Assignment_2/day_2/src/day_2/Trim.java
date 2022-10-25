package day_2;
import java.util.ArrayList; 

public class Trim {


	//for ArrayList functions 
	 public static void main(String[] args) 
	 { 

	     ArrayList<Integer> myArr = new ArrayList<Integer>(10); 

	     myArr.add(5); 
	     myArr.add(4); 
	     myArr.add(3); 
	     myArr.add(77); 
	     myArr.add(5); 
	     
	     //trims 10 to 5
	     myArr.trimToSize(); 

	     System.out.println(myArr.size());

	     System.out.println("The List elements are:"); 

	     for (Integer i : myArr) { 
	         System.out.println("Number = " + i); 
	     } 
	 } 
	}   

	//Output:
	//	
//		5
//		The List elements are:
//		Number = 1
//		Number = 2
//		Number = 3
//		Number = 4
//		Number = 5

