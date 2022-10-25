package day_2;
import java.util.*;
public class update {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> myList = new ArrayList<Integer>();
			myList.add(1);
			myList.add(2);
			myList.add(3);
			myList.add(4);
			
			System.out.println(myList);
			
			System.out.println("4th Element is: "+ myList.get(3));
			
			myList.set(3, 10);
			
			System.out.println(myList);
			
			System.out.println("My List after retrieving and updating :" +myList);

		}

	}

