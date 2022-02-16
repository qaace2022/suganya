package source;

public class StringClass {

	public static void main(String[] args) {
		//CharAt, length, equals, concat, indexof, compareto, uppercase, lowercase, trim, split, join, contains, substring etc….)
        //CharAt
		String str="Apple";
        for(int i=0;i<str.length();i++) {
        System.out.println(str.charAt(i));
        }  
        
        
        //length
        String l1="bluecolor";
        String l2="Kstu67%)";
        System.out.println("length of l1= "+l1.length());
        System.out.println("length of l2= "+l2.length());
        
        //equals & equalsIgnoreCase
        String e1="Welcome";
        String e2="WELCOME";
        boolean bool=e1.equals(e2);
        System.out.println(bool);
        
        System.out.println(e1.equalsIgnoreCase("WelcoMe"));
        
        //concat & join
        String c1="God bless ";
        String c2="you dear";
        String c3=" You";
        System.out.println(c1.concat(c2));
        
        System.out.println(c2.join(c1,c3));
        c3=c1.join(c3,c1);
        System.out.println(c3);
        
        //indexof & lastIndexOf
        String i="sirius";
        for(int j=0;j<i.length();j++) {
        System.out.println(i.indexOf(i.charAt(j)));
        }
       int k=i.indexOf('s');
       int l=i.indexOf('s',k+1);
       System.out.println("first occurance index = " +k+ "  Second occurance index = "+l);
     
       System.out.println(i.lastIndexOf('r')); //1
       System.out.println(i.lastIndexOf('u')); //6
       
       //compareto
       String com1=new String("Dog");
       String com2=new String("Dog");
       System.out.println(com1.compareTo(com2)); //If string is equal it returns 0 
       
       
       
       //uppercase and lowercase
       String strn=new String("GanDhi Ji");
       System.out.println(strn.toUpperCase());
       System.out.println(strn.toLowerCase());
       
       //trim 
       String s="      I love my Country      ";
       System.out.println(s.trim());
       
       //split & contains & substring & startsWith & endsWith
       String sp="India&America&England&Dubai&Canada&Singapur";
       String[] arr=sp.split("&");
       for(int j=0;j<i.length();j++) {
       System.out.println(arr[j]);
       }
       
       System.out.println(sp.contains("rica")); //true
       System.out.println(sp.contains("Rica")); //false
       
       System.out.println(sp.substring(8));
       System.out.println(sp.substring(8,20));
       
       System.out.println(sp.startsWith("Ind")); //true
       System.out.println(sp.startsWith("InD")); //false
       
       
       System.out.println(sp.endsWith("gapur")); //true
       System.out.println(sp.endsWith("Gapur")); //false
       	}

}
