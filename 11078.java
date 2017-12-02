package pkg11078;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        do {
            boolean found = false;
            int s = input.nextInt();
            int m = input.nextInt();

            int diff = -9999999; // old difference

            for (int i = 0; i < s - 1; i++) {

                int d = input.nextInt();
                 int com=m-d; // new difference max - new number



                if (diff < (com)) {
                    diff = com;
                }


                if (m < d) {
                    m = d;
                }

            }
            System.out.println(diff);

        } while (--n != 0);

    }

}
