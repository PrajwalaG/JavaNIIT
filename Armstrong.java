package myPackage;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int s=0,r=0,a=n;
		while(n!=0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if(a==s)
			System.out.println("Given number is an Armstrong number");
		else
			System.out.println("Given number is not an Armstrong number");
		sc.close();
	}

}
