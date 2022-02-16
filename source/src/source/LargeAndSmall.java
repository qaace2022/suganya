package source;

public class LargeAndSmall {

	public static void main(String[] args) {
		int[] arr= {10,5,2,67,33};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
				int t=arr[i];
				 arr[i]=arr[j];
				 arr[j]=t;
				}
			}
		}
		
		System.out.println("The smallest element in the array is " + arr[0]);
		System.out.println("The largest element in the array is " + arr[arr.length-1]);
		

	}

}
