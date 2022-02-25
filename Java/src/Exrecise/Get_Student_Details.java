package Exrecise;

import java.util.Scanner;
public class Get_Student_Details {

	public static void main(String[] args) {
		String[] arr= {" Name ", "Roll Number", "Maths mark","Physics mark", "Chemistry mark" ,"Biology mark"};
		Scanner scn=new Scanner(System.in);
		System.out.println(" Max mark per subject is 100,Now enter the below details");
		
		String[] str=new String[arr.length];
		for (int i = 0; i < arr.length; i++)  { 

		      System.out.println("enter your "+arr[i]);
		      str[i]=scn.nextLine(); 
        } 
		
		for(int j = 0; j < str.length; j++)  { 

		      System.out.println("your "+arr[j]+" = "+str[j]);
		      scn.close();
        } 
		
		int tot_mark=0;
		int tot_sub=0;
		
         for(int k=2;k<str.length;k++)
         {
            tot_mark=tot_mark+ Integer.parseInt(str[k]);
            tot_sub++;
         }
		System.out.println("\nThe total mark is "+tot_mark +" out of "+tot_sub*100);
		System.out.println("The percentage is "+tot_mark/tot_sub);
		
		
	}
	}


