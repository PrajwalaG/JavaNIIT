package myPackage;

import java.util.Scanner;

public class FactorialOfOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();		
		int j,f=1;
		for(j=1;j<=n;j++)
			{
				f=f*j;
			}
			System.out.println("Factorial of "+n+":"+f);
		sc.close();

	}

}
