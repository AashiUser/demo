package Recursion;

import java.util.Scanner;

public class Factorial {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Not applicable..... Sorry!!!");
			throw new RuntimeException();
		}
		int fact = factorial(n);
		System.out.println(fact);
		
	}

}
