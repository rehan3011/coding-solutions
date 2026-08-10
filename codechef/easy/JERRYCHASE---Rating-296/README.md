# JERRYCHASE - Rating 296

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Battery Health

Apple considers any iPhone with a battery health of $80\%$ or above, to be in  *optimal*  condition.

Given that your iPhone has $X\%$ battery health, find whether it is in  *optimal*  condition.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains an integer $X$ — the battery health.
### Output Format

For each test case, output on a new line, `YES`, if the battery is in  *optimal*  condition, and `NO` otherwise.

You may print each character in uppercase or lowercase. For example, `NO`, `no`, `No` and `nO`, are all considered identical.

### Constraints
- $1 \leq T \leq 100$
- $0 \leq X \leq 100$
### Sample 1:
Input
Output

```
4
97
42
80
10

```

```
YES
NO
YES
NO

```

### Explanation:

 **Test case $1$:**  The battery health is $97 \%$ which is greater than equal to $80 \%$. Thus, the battery is in optimal condition.

 **Test case $2$:**  The battery health is $42 \%$ which is less than $80 \%$. Thus, the battery is not in optimal condition.

 **Test case $3$:**  The battery health is $80 \%$ which is greater than equal to $80 \%$. Thus, the battery is in optimal condition.

 **Test case $4$:**  The battery health is $10 \%$ which is less than $80 \%$. Thus, the battery is not in optimal condition.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-02-10T17:55:36.778Z  

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

```

---

[View on CodeChef](https://www.codechef.com/problems/JERRYCHASE)