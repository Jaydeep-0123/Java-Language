import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length()){
            a = a.toUpperCase();
            b = b.toUpperCase();
            char arr1[]  = a.toCharArray();
            char arr2[] = b.toCharArray();
            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);
            return java.util.Arrays.equals(arr1, arr2);
        }
        else{
            return false;
        }
    }
    
