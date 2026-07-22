import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n>0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    int e = sc.nextInt();
		    
	    if(((a+b)<=d && c<=e) ||((a+c)<=d &&b<=e) ||((b+c)<=d &&a<=e))
	     System.out.println("YES");
	    else
	    System.out.println("NO");
	  
		    n--;
		}

	}
}
