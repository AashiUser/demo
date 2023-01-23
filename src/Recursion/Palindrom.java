package Recursion;

import java.util.Scanner;

public class Palindrom {
static boolean isPalindrome(int l,int r, String s) {
	if(l>=r) return true;
	if(s.charAt(l)!= s.charAt(r)) return false;
	return isPalindrome(l+1,r-1,s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		int l = 0;
		int r= str.length()-1;
		boolean result = isPalindrome(0,str.length()-1,str);
		System.out.println(result);
	}

}
