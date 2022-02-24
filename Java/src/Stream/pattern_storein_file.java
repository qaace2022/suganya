package Stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class pattern_storein_file {

	public static void main(String[] args) throws IOException {
		File file=new File("/Users/suganya.kandasamy/Documents/pattern.txt");
		FileWriter fw=new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw=new BufferedWriter(fw);
		int n=4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>=j)
				{
					bw.write("*");
					bw.flush();
					
				}
					
				else
				{
			    bw.write("");
			    
				}
			}
			
			bw.newLine();
			

			}
System.out.print("output printed in txt file successfully");
}
}
