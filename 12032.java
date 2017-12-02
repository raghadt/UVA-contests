
package pkg12032;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int q = 0;
        do {

            q++;
            int d = input.nextInt();
            arr = new int[d+1];
            arr[0] = 0;
            for (int i = 1; i <= d; i++) {
                arr[i] = input.nextInt();

            }
            int max = -9999999;

            for (int i = 1; i <= d; i++) {
                   // System.out.println(arr[i]);
                int diff = arr[i] - arr[i - 1];

                if (diff > max) {
                    max = diff;
                }
            }

            int num = m(max, d);

            System.out.println("Case " + q + ": " + num);
        } while (--n != 0);

    }

    public static int m(int max, int n) {
        int num = max;
        for (int i = 1; i <= n; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff == max) {
                max--;
            } else if (diff > max) {
                num++;
                break;
            }
        }
        return num;
    }

}
