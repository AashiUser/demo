package Recursion;

import java.util.Scanner;

public class Fibnocci {

	static int fibnocci(int n) {
		if(n==1) return 1;
		if(n==2) return 1;
		return fibnocci(n-1)+ fibnocci(n-2);
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
		int fibo = fibnocci(n);
		System.out.println(fibo);
	}

}
