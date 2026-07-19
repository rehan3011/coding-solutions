import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		 int die;
		for(int i=0; i<n; i++){
		  die = sc.nextInt();
		  
		  if(die>0&&die<6){
		      System.out.println("NO");
		  }
		  if(die == 6){
		      System.out.println("YES");
		  }
		}

	}
}
