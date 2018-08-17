import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n, k,i;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		System.out.println();
		int a[]=new int[n];
	
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<k;i++)
	{
		sum=sum+a[i];
	}
	System.out.println(sum);
}
}
	
