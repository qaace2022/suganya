package source;

public class ArrayTryItOut {

	public static void main(String[] args) {
		System.out.println("try It Out");
		int[] numberArray= {23,64,89,26,93};
		for(int currentNumber=0;currentNumber<=numberArray.length;currentNumber++) {
			System.out.println("Printing the current number : "+ numberArray[currentNumber]);
		}
		
	}

}/*In this program numberarray length  is 5 & only 4 element is there
when currentNumber value gets 5 there is no element for index value of 5,so JVM generates ArrayIndexOutOfBoundsException */