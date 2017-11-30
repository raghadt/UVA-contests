package contest1;

/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h, d, s, m;
        String t;

        // System.out.println( h.substring(0,2)); // ra
        do {

            t = input.nextLine();

            int H = Integer.valueOf(t.substring(0, 2));
            int M = Integer.valueOf(t.substring(2, 4));
            int S = Integer.valueOf(t.substring(4, 6));
            int D = Integer.valueOf(t.substring(6, 8));

            /*
             H*=60;
             M+=H*60;
             S+=M*100;

             D+=S;

             */
            double f = (((H * 60 + M) * 60 + S) * 100 + D) * 1000.0 / 864.0;
            h = (int) f;
            d = h % 100;
            h /= 100;
            s = h % 100;
            h /= 100;
            m = h % 100;
            h = h / 100;

            System.out.printf("%d%02d%02d%02d\n", h, m, s, d);

        } while (input.hasNext());

    }

}
