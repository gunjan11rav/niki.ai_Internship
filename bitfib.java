import java.io.*;
import java.util.*;
import java.math.*;
 
public class bitfib
{
    static BigInteger fib(int n)
    {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }
 
        return (c);
    }
 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int n1=0;
		int n2=0;
		int[] arr=new int[t];
		for(int i=0;i<t;i++)
		{
			n1=sc.nextInt();
			arr[i]=n1;
		}
		for(int i=0;i<t;i++)
		{
			n2=arr[i];
			System.out.println(fib(n2+2));
		}
    }
}