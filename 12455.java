package pkg12455;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        int n = input.nextInt();
        while (n != 0) {
            boolean found = false;
            int result = input.nextInt();
            int d = input.nextInt();
            arr = new int[d];
            for (int i = 0; i < d; i++) {
                arr[i] = input.nextInt();

            }

            /*
             System.out.print("look here ");
             // System.out.println( 1 << d);

             for (int i = 0; i < (1 << d); i++) {
             sum = 0;
             for (int j = 0; j < d; j++) {

             if ((i & (1 << j)) != 0) {
             sum += arr[j];
             }
             }

             if (sum == result) {
             System.out.println("YES");
             found = true;
             break;
             }
             }

             if (!found) {
             System.out.println("NO");
             */
            boolean s = s(0, 0, result);
            if (s) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
            n--;
        }



    }

    public static boolean s(int i, int sum, int result) {
        if (sum == result) {
            return true;
        }
        if (i == arr.length) {
            return false;
        }
        if (s(i + 1, sum + arr[i], result)) {
            return true;

        }
        if (s(i + 1, sum, result)) {
            return true;
        }

        return false;
    }
}
