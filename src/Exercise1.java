/**
 * Create a method which accepts an array of integer elements and return 
 * the second smallest element in the array
 * 
 * @author Joel
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string of numbers");
		String str = sc.nextLine();
		
		String a[] = str.split("");
		Arrays.sort(a);
		System.out.println("the second smallest number present is "+ a[1]);
		
		
		
			

	}
}