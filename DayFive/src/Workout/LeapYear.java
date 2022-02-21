package Workout;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	System.out.println("Enter any year like 2014,1986 etc ");
	int year=scn.nextInt();
	if(((year%4==0)&& (year%100!=0))||(year%400==0))
	{
		System.out.println("Given year is leap year");
		
	}
	else
	{
		System.out.println("Given year is not leap year");
	}
	
 }

}
