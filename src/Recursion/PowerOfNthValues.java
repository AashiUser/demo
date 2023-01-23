package Recursion;

import java.util.Scanner;

public class PowerOfNthValues {

	static long powerOfNum(int x, int n) {
		if(n==0) return 1;
		
		//return x* powerOfNum(x,n-1);
		long temp = powerOfNum(x,n/2);
		if(n%2==1) return temp * temp * x;
		else return temp*temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit1");
		int x = sc.nextInt();
		System.out.println("Enter digit2");
		int n = sc.nextInt();
		if(x<0) {
			System.out.println("Not applicable..... Sorry!!!");
			throw new RuntimeException();
		}
		long powerNum = powerOfNum(x,n);//powerOfNum(3,2)
	/* powerOfNum(3,2/2)=temp = powerOfNum(3,1)
	 * temp*temp*3;
	 * powerOfNum(3,1/2)=temp = powerOfNum(3,0)
	 * temp*temp*3*3;
	 * =>9*/
	System.out.println(powerNum);
	}
}
