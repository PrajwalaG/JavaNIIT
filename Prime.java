package myPackage;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,count=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		if(count==1)
		{
			System.out.println("The given number is prime");
		}
		else
		{
			System.out.println("The given number is not prime");
		}
		sc.close();
	}

}
