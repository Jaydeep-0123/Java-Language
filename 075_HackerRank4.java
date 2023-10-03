import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){    
                String s1=sc.next();
                // System.out.print(s1);
                int x=sc.nextInt();
               System.out.printf("%-15s%03d%n" ,s1,x);

                //System.out.print("   ");
                //System.out.print(x);
                //System.out.println();
            }
            System.out.println("================================");

    }
}



