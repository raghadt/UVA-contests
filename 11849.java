package pkg11849;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //   int[] a = new int[100000000];
        while (true) {

            //   Long[] b = new Long[1000000000];
            int[] a = new int[100000000];
            int counter = 0;

            int n1 = input.nextInt();
            int n2 = input.nextInt();

            if (n1 == 0 && n2 == 0) {
                break;
            }

            for (int i = 0; i < n1; i++) {
                a[input.nextInt()] = 1;
            }

            for (int i = 0; i < n2; i++) {
                //  System.out.println(i);
                //    System.out.println(a[input.nextInt()]);
                if (a[input.nextInt()]==1) {
                    counter++;
                }
            }

            /*

             ArrayList<Boolean> l1 = new ArrayList<Boolean>();



             for (int i = 1; i < n1; i++) {
             l1.add(i, true);

             }

             for (int i = 1; i < n2; i++) {
             System.out.println("i is "+i);
             System.out.println(l1.get(i));
             if (l1.get(i)) {
             counter++;
             }



             }*/
            System.out.println(counter);

        }

    }

}
