package myPackage;
import java.util.*;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int i,a;
        System.out.println("Enter the number:");
        a=sc.nextInt();
        for(i=1;i<=12;i++)
        {
        	System.out.println(a+"*"+i+"="+a*i);
        }
        sc.close();
        
	}

}
