package contest2;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int counter = 1;

        while (n != 0) {

            int c = input.nextInt();

            double f = ((9.0 / 5.0) * c) + 32;

            double d = input.nextDouble();

            f = f + d;

            double cl = (5.0 / 9.0) * (f - 32);

            System.out.printf("Case %d: %.2f", counter, cl);
            System.out.println();
            counter++;
            n--;

        }

    }

}
