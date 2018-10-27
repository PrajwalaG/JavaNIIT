package myPackage;

import java.util.Scanner;

public class BiggestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=0,small=0;
		if(a>b && a>c)
			big=a;
		else if(b>a && b>c)
		    big=b;
		else
			big=c;
		if(c<a && c<b)
			small=c;
		else if(b<a && b<c)
			small=b;
		else 
			small=a;
		System.out.println("Biggest:"+big);
		System.out.println("Smallest:"+small);
		sc.close();

	}

}
