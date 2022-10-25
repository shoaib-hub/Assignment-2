package day_2;
import java.util.HashMap; 

public class Occurence {
	public static void main(String args[])   
	{  
	String str = "dgdfgdfhdfsdfsdfdgdfhgfjghjgfhjghjgfghdfgdfgsdfsdcfdfgfgnmfzsdfdfdffffsdfsddasdsghjhgg";  
	//HashMap char as a key and occurrence as a value  
	HashMap <Character, Integer> charCount = new HashMap<>();  
	for (int i = str.length() - 1; i >= 0; i--)   
	{  
	if(charCount.containsKey(str.charAt(i)))   
	{  
	int count = charCount.get(str.charAt(i));  
	charCount.put(str.charAt(i), ++count);  
	}   
	else   
	{  
	charCount.put(str.charAt(i),1);  
	}  
	}  
	System.out.println(charCount);  
	}  
	}  

// output
//{a=1, s=9, c=1, d=20, f=23, g=16, h=8, j=5, z=1, m=1, n=1}
