package Exrecise;

import java.util.Scanner;
public class MethodOverLoading {
	
    int Method(int a,int b,int c)
	  {
	 	 int d=a+b+c;
	 	 return d;
	  }
	String Method(String s)
	 {
		return s;
	 }
	

	public static void main(String[] args) {
		int[] val=new int[3];
		Scanner scn=new Scanner(System.in);
		for(int i=0;i<val.length;i++) {
			System.out.println("enter the number "+(i+1));
			val[i]=scn.nextInt();
			scn.nextLine();
		}
		
		MethodOverLoading m1=new MethodOverLoading();
		
		System.out.println("The addition of 3 number = "+m1.Method(val[0],val[1],val[2]));
		System.out.println("\nNow Enter the string");
		String str=scn.nextLine();
		System.out.println("The string you entered = "+m1.Method(str));
		scn.close();
	 }
}
