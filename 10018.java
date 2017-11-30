package reverse;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long n;
        int counter = 0;
        int x = input.nextInt();

        for (int i = 0; i < x; i++) {

            n = input.nextLong();

            counter = 0;

            while (reversing(n) != n) {

                n += reversing(n);

                counter++;

            }

            System.out.println(counter + " " + n);

        }

    }

    public static long reversing(long x) {
        long rev = 0;
        while (x > 0) {
            rev *= 10;
            rev += x % 10;
            x /= 10;
        }

        return rev;
    }
}
