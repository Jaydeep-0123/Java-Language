import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int n = A.length();
    int i =0;
    int count = 0;
    while (i<A.length()/2)
    {
        if (A.charAt(i)==A.charAt(n-1))
        {
            i++;
            n--;
            continue;
        }
        else
            System.out.println("No");
            count = 1;
            break;
    }
    if (count!=1)
    System.out.println("Yes");

}
        
    }


