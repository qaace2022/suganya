package OOPS;

class Addition{
	int c;

    Addition(int a,int b){

        c=a+b;

    }

}

class Subtraction{
	int c;
 
	Subtraction(int a,int b){
          c=a-b;
   }

}

class Multiplication{
	int c;

  Multiplication(int a,int b){
           c=a*b;

    }

}

class Division{
	int c;

    Division(int a,int b){

        c=a/b;

    }

}

public class Calculator {


	public static void main(String[] args) {
		
		Addition add = new Addition(2,3);
	        

        

        Subtraction sub = new Subtraction(5,3);

        
        Multiplication mult = new Multiplication(10,4);

       
        Division div = new Division(34,6);
        System.out.println("Addition = "+add.c);

        System.out.println("Subtraction = "+sub.c);

        System.out.println("Multiplication = "+mult.c);

        System.out.println("Division = "+div.c);

	}

}