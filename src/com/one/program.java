package com.one;
import java.util.Scanner;
public class program {
	public static void main(String[] args) {
		System.out.println("hello world");
		Scanner s = new Scanner(System.in);
		//Square of a number
		System.out.println("Enter a number:");
		int n = s.nextInt();
		System.out.println("Square of the number is "+ (n*n));
		
	}
}
