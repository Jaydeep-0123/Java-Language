import java.util.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int c = 1;
            int d = a;
            for(int j=0;j<n;j++){
                d += c*b;
                System.out.print(d+" ");
                c *= 2;
            }
            System.out.println();
        }
        
    }
}
