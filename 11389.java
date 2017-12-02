package pkg11389;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int n = input.nextInt();
            int hours = input.nextInt();
            int r = input.nextInt();

            if (n == 0 && hours == 0 && r == 0) {
                break;
            }

            int[] arr = new int[n];
            int[] arr2 = new int[n];

            int sum = 0;
            for (int i = 0; i < n ; i++) {
                arr[i] = input.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n ; i++) {
                arr2[i] = -input.nextInt();
            }

            Arrays.sort(arr2);

            for (int i = 0; i < n; i++) {

                int an = arr[i] + (-arr2[i]);
               // System.out.println(Result);
                if (an > hours) {
                    sum += (an - hours) * r;
                }
            }

            System.out.println(sum);
        }

    }

}
