package Workout;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the String ");
		String s=scn.next();
		String str="";
		s=s.toUpperCase();
		boolean bool=false;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				bool=true;
				break;
				
			}
		}
     if(bool==false)
     {
    	System.out.println("Given string is palindrome");
     }
     else
    	 System.out.println("Given string is not  palindrome");
	}

}
