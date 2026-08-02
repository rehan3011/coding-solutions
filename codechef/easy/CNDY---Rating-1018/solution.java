/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for (int i = 0; i < t; i++) {
         int n =sc.nextInt();
         int [] a = new int [n*2];
         for(int j=0;j<a.length;j++){
             a[j]= sc.nextInt();
         }int count=0;
           int count2= 0;
         for(int j=0;j<a.length;j++){
              count=0;
              for(int k =0;k<a.length;k++){
                 if (a[j]==a[k]){
                     count++;
                 }
             }
             //System.out.println(count);
             if(count>2){
                 System.out.println("No");
                 break;
             }
             else{
                 count2++;
             }
         }
         if(count2 ==a.length){
             System.out.println("Yes");
         }




       }

	}
}