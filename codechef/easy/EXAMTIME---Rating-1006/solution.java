import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d=0,s=0;
		
		int ddsa, dtoc, ddm, sdsa, stoc, sdm = 0;
		for(int i=0; i<n; i++){
		    
		    ddsa = sc.nextInt();
		    dtoc =  sc.nextInt();
		    ddm =  sc.nextInt();
		    sdsa =  sc.nextInt();
		    stoc =  sc.nextInt();
		    sdm =  sc.nextInt();
            
            d+=ddsa+dtoc+ddm;
            s+=sdsa+stoc+sdm;
            
            if(d>s) System.out.println("DRAGON");
            else if(s>d) System.out.println("SLOTH");
            else if(s==d){
                if(ddsa>sdsa) System.out.println("DRAGON");
                else if(sdsa>ddsa) System.out.println("SLOTH");
                else if(dtoc>stoc) System.out.println("DRAGON");
                else if(stoc>dtoc) System.out.println("SLOTH");
                else System.out.println("TIE");
            }
            
		}


	}
}
