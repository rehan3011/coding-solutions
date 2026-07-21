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
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sqrt = (int) Math.sqrt(x);
            System.out.println(sqrt*y);
            n--;
        }
        
	}
}
