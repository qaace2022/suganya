package four;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number1");
		int a=scn.nextInt();
		System.out.println("Enter the number2");
		int b=scn.nextInt();
		System.out.println("Enter the opetarion name  you want (Addition or Subtraction or Multiplication or Division or Modulus");
		String operator=scn.next();
		scn.close();
		operator=operator.toUpperCase();
		if(operator.contains("ADD"))
		{
			System.out.println(a+b);
		}
		else if(operator.contains("SUB"))
		{
			System.out.println(a-b);
		}
		else if(operator.contains("MULT"))
		{
			System.out.println(a*b);
		}
		else if(operator.contains("DIV"))
		{
			System.out.println(a/b);
		}
		else if(operator.contains("MOD"))
		{
			System.out.println(a%b);
		}
		else
			System.out.println("enter the valid operation name");
		}
	}


