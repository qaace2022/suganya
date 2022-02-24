package pack;

public class ReverseAlphabets {
	
	private static String cpy;


	static String Com(String val,int l,String str) {
       cpy=str;
       if((val.charAt(l)>='a'&&val.charAt(l)<='z')||(val.charAt(l)>='A'&&val.charAt(l)<='Z'))
       {
	 cpy=cpy+val.charAt(l);
       }
	 l--;
	
	 if(l>=0) {
	
		Com(val,l,cpy);
		
	 
	 }
	 
	return str;
	
	
	}
	
	
	public static void main(String[] args) {
		String s="AbcD1234EfgH";
		String st="";
		int len=s.length()-1;
		Com(s,len,st);
		
		System.out.println(cpy);
	
	
	}

}
