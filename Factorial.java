package myPackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();		
		int i,j,f=1;
		for(i=1;i<=n;i++)
		{f=1;
			for(j=1;j<=i;j++)
			{
				f=f*j;
			}
			System.out.println("Factorial of "+i+":"+f);
		}
		sc.close();
	}

}
