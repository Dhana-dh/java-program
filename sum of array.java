//finding sum of a array
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		int []a=new int[4];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{ 
		    a[i]=sc.nextInt();
		    
		}
		for(int i=0;i<a.length;i++)
		{
		    sum+=a[i];
		}
		{
		    System.out.println(sum); 
		}
	}
}