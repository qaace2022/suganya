package pyramid;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		Scanner scn=new Scanner(System.in);
		System.out.println("values of a=10,b=5 ");
		System.out.println("enter the number 1.Addition 2. Subtraction  3.Multiplication 4.Division %.Modulus");
		int operation=scn.nextInt();
		switch(operation) {
		case 1:System.out.println(a+b);
		break;
		case 2:System.out.println(a-b);
		break;
		case 3:System.out.println(a*b);
		break;
		case 4:System.out.println(a/b);
		break;
		case 5:System.out.println(a%b);
		break;
		default: System.out.println("Enter the valid option");
		}
	}

}
