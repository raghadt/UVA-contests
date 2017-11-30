package auto;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        int n = 0;
        for (int i = 0; i < x; i++) {
            n = input.nextInt();

            n *= 567;
            n /= 9;
            n += 7492;
            n *= 235;
            n /= 47;
            n -= 498;

            n %= 100;
            n /= 10;

            System.out.println(Math.abs(n));
        }

    }

}


/*
 n *= 567;
 System.out.println(n);
 n /= 9;
 System.out.println(n);
 n += 7492;
 System.out.println(n);
 n *= 235;
 System.out.println(n);
 n /= 47;
 System.out.println(n);
 n -= 498;
 System.out.println(n);

 */
