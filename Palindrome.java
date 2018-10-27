package myPackage;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
        int n=sc.nextInt();
        int a=n;
        int r=0,s=0;
        while(n!=0)
        {
        	r=n%10;
        	s=s*10+r;
        	n=n/10;
        }
        if(a==s)
        	System.out.println("Given number is a palindrome");
        else
        	System.out.println("Given number is not a palindrome");
        sc.close();
	}

}
