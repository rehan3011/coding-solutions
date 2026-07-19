# EXAMTIME - Rating 1001

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-19T10:21:32.044Z  

```java
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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    for(int j=0; j<x; j++){
		        int z = sc.nextInt();
		        
		        if(z<=y){
		            System.out.print("1");
		            y= y-z;
		        }
		        else{
		            System.out.print("0");
		        }
		        
		    }
		    System.out.println();
		}
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EXAMTIME)