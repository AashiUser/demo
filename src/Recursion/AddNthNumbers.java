package Recursion;

import java.util.Scanner;

public class AddNthNumbers {

	static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return n+sum((n-1));
		
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
		int sumOfNum = sum(n);
		System.out.println(sumOfNum);
	}

}
