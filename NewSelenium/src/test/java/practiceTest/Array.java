package practiceTest;

import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        for(int i=n;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
