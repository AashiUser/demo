package Recursion;

import java.util.Scanner;

public class ReverseNumber {
static void reverseNum(int n) {
    if(n<10) {
    	System.out.println(n);
    }
    else {
    	System.out.print(n % 10);
    	reverseNum(n/10);
    }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit");
		int n = sc.nextInt();
		System.out.print("Reverse number is:");
		reverseNum(n);
	}

}
