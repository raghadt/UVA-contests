package pkg10295;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();


        TreeMap tm = new TreeMap();

        String[] arr = new String[m];
        int[] val = new int[m];

        for (int i = 0; i < m; i++) {

            tm.putIfAbsent(input.next(), input.nextInt());

            // arr[i] = input.next();
            //val[i] = input.nextInt();
        }

        for (int j = 0; j < n; j++) {

            String d;
            int counter = 0;

            do {
                d = input.next();
                for (int i = 0; i < m; i++) {
                    if (tm.containsKey(d)) {

                        counter += (Integer) tm.get(d);
                        break;
                    }

                }

            } while (!d.equals("."));
            System.out.println(counter);

        }

    }

}
