package Exrecise;

import java.util.Arrays;
import java.util.List;


  
public class Multi_out{
	static List<Object> getDetails(String name, int age,char gender)
    {
        String a= name;
        int b =age;
        char c =gender;
        return Arrays.asList(a,b,c);
  
    }
  
   
    public static void main(String[] args)
    {
      List<Object> person = getDetails("suganya",22,'f');
      System.out.println(person);
      List<Object> person2=getDetails("nayanthara",30,'f');
      System.out.println(person2);
      
    }


	
	}

