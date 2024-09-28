//3.Find the second maximum and second minimum Elements of an array.
package ArraysCode;

import java.util.Arrays;

public class SecondMaximumSecondMinimum {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5,6};
		Arrays.sort(arr);
		System.out.println(arr[1]);
		System.out.println(arr.length-2);


	}

}
