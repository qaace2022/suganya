package Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class String_Storein_File {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the string value");
		String s=scn.next();
		
		
		try {
			File file=new File("/Users/suganya.kandasamy/Documents/string.txt");
			FileWriter fw=new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(s);
			bw.close();
			System.out.println("successfully string is stored");
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		

	}

}
