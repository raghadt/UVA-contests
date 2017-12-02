
package pkg10341;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    static double p;
    static double q;
    static double r;
    static double s;
    static double t;
    static double u;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {

            p = input.nextDouble();
            q = input.nextDouble();
            r = input.nextDouble();
            s = input.nextDouble();
            t = input.nextDouble();
            u = input.nextDouble();

            //System.out.println(p+" "+q+" "+r+" "+s+" "+t+" "+u);
            double a = 0.0;
            double b = 1.0;

            double x = bisectino(0, 1);
            //   System.out.println(x);

            if (x == 0.0) {
                System.out.println("No solution");
            } else {
                System.out.printf("%1.4f\n", x);
            }

        } while (input.hasNext());

    }

    public static double bisectino(double a, double b) {
        double tolerance = Math.pow(10, -7);
        int n = 1;
        double c;
        do {
            if (f(a) * f(b) > 0) {
                return 0.0;
            }

            c = (a + b) / 2;
            if (f(c) == 0 || ((b - a) / 2) < Double.MIN_VALUE) {
                return c;
            }

            if (sign(f(c)) == sign(f(a))) {
                a = c;
            } else {
                b = c;
            }

            n++;

        } while (Math.abs(a - b) / 2 >= tolerance && Math.abs(c) > tolerance && n <= 1000);

        return c;
    }

    public static double f(double x) {
        /*
         p * -e x + q  sin(x) + r  cos(x) + s  tan(x) + t  x2 + u = 0
         */

        Double e = 0.0;
        e += (p * Math.exp(-x));

        e += q * Math.sin(x);

        e += r * Math.cos(x);

        e += s * Math.tan(x);

        e += t * Math.pow(x, 2);

        e += u;
        /*
         System.out.println("x "+x);
         System.out.println("p :"+p);
         System.out.println(Math.exp(-x));
         Double e = (p * Math.exp(-x));
         System.out.println("p "+e);
         e += (q * Math.sin(x));
         System.out.println("q "+e);
         e += (r * Math.cos(x));
         System.out.println("r "+e);
         e += (s * Math.tan(x));
         System.out.println("s "+e);
         e += (t * Math.pow(x, 2));
         System.out.println("t"+e);
         e += u;
         System.out.println("u "+u);
         */

        return e;

    }

    public static boolean sign(double n) {

        return n > 0;

    }

}
