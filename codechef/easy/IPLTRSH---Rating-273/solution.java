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
	        int x,y;
	        
	        for(int i=0; i<n; i++){
	            x = sc.nextInt();
	            y = sc.nextInt();
	            
	            if(x>=y){
	                System.out.println(x-y);
	            }
	            else{
	                System.out.println("0");
	            }
	        }

	}
}
