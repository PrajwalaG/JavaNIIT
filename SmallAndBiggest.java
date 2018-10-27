package myPackage;

import java.util.Scanner;

public class SmallAndBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]=new int [20];
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array:");
        n=sc.nextInt();     
        System.out.println("Enter the elements in the given array:");
        for(i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        int min=a[0];
        for(i=1;i<n;i++)
        {
        	if(min>a[i])
        		min=a[i];
        }
        int max=a[0];
        for(i=1;i<n;i++)
        {
        	if(max<a[i])
        		max=a[i];
        }
        System.out.println("Minimum:"+min);
        System.out.println("Maximum:"+max);
        sc.close();
	}

}
