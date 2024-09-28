//6.    Program to check Harshad number or not using Java
//Hint: - Harshad number is a number or an integer in base 10 which is 
//completely divisible by sum of its digits.
package ArraysCode;

import java.util.Scanner;
import java.util.Arrays;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the numbers= ");
		n = sc.nextInt();

		int result = 0;

		while (n != 0) {
			int pick_last = n % 10;
			result = result + pick_last;
			n = n / 10;
		}

		if (n % result == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}
}