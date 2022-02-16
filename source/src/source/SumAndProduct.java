package source;

public class SumAndProduct {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int sum=0;
		int product=1;
		for(int i=0;i<arr1.length;i++) {
			sum=sum+arr1[i];
			product=product*arr1[i];
		}
		System.out.println("The sum of elements = " + sum);
		System.out.println("The product of elements = " + product);

	}

}
