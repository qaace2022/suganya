package source;

import java.util.Arrays;

public class JavaUtilArray {

	public static void main(String[] args) {
		int[] val= {4,3,2,1,90,45,63};
		Arrays.sort(val);
		System.out.println(val[val.length-1]);
		System.out.println(Arrays.binarySearch(val,45 ));
		System.out.println(Arrays.binarySearch(val, 1, 4, 6));
		
	}

}
