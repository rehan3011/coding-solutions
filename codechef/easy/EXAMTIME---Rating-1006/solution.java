import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
		    
		    int ddsa = sc.nextInt();
		    int dtoc =  sc.nextInt();
		    int ddm =  sc.nextInt();
		    int sdsa =  sc.nextInt();
		    int stoc =  sc.nextInt();
		    int sdm =  sc.nextInt();
            
           int  d=ddsa+dtoc+ddm;
           int  s=sdsa+stoc+sdm;
            
            if(d>s) System.out.println("DRAGON");
            else if(s>d) System.out.println("SLOTH");
            else{
                if(ddsa>sdsa) System.out.println("DRAGON");
                else if(sdsa>ddsa) System.out.println("SLOTH");
                else if(dtoc>stoc) System.out.println("DRAGON");
                else if(stoc>dtoc) System.out.println("SLOTH");
                else System.out.println("TIE");
            }
            
		}


	}
}
