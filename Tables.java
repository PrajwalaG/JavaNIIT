package myPackage;
import java.util.*;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=1;i<=10;i++)
        {
        	for(j=1;j<=12;j++)
        	{
        		System.out.println(i+"*"+j+"="+i*j);
        	}
        	System.out.println();
        }
        sc.close();
	}

}
