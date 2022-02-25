package Exrecise;

public class String_Operators {

	public static void main(String[] args) {
		String s1=" I love my country ";
		String s2="India";
		String s3="indIa";
		//repeat()
		System.out.println(s1.repeat(2));
		//split()
		String[] arr=s1.split(" ");
		
		for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		//contains()
		System.out.println(s2.contains("Ind"));
		//equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		//concat()
		
		System.out.println(s1.concat(s2));
	}

}
