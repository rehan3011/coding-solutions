# XLSQUARE - Rating 1160

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Large Square

You are given $N$ identical squares, each with side length $A$. All the squares have their sides parallel to the $x-axis$ and $y-axis$. That is, the squares are not tilted. You have to take several (possibly, zero or all) squares and rearrange them to obtain a mega square. The mega square can't have any gap in the enclosed region or have overlapping squares. Also, you cannot rotate any square.

Output the side length of the largest mega square that you can obtain.

### Input Format
- The first line of input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.
- The first and only line of each test case contains two space-separated integers $N, A$.
### Output Format

For each test case, print a single line containing one integer - the side length of the largest square you can obtain.

### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq A \leq 10^4$
### Sample 1:
Input
Output

```
5
3 2
5 3
16 18
11 8
8 6

```

```
2
6
72
24
12

```

### Explanation:

 **Test case $1$:**  You can choose just one square to form the mega square. So the side length will be $2$.

 **Test case $2$:**  You can choose $4$ squares to form a mega square with side-length $2 \cdot A$ $= 6$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-21T17:25:56.191Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/XLSQUARE)