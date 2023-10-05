import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static int B;
static int H;
static boolean flag;
static{
    Scanner sc=new Scanner(System.in);
    try{
    B=sc.nextInt();
    H=sc.nextInt();
    
    if(B>0 && H>0)
    {
        flag = true;
    }
    else
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
  }
  catch(Exception e)
  {
    System.out.println("Handle Exception");   
  }
    
}
