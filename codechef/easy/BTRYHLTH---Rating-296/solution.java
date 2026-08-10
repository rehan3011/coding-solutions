import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
		    int a = sc.nextInt();
		    
		    if(a<80){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}

	}
}
