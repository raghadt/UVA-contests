package guess;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        String st, st1;
        int n;
        int max = 0, min = 0, right;

        do {

            do {

                n = input.nextInt();
                if (n == 0) {
                    break;
                }
                st = input.next();
                st1 = input.next();
                if (st.equals("right")) {
                    right = n;
                } else if (st1.equals("high")) {

                    max = n;

                } else {
                    min = n;
                }

            } while (!st.equals("right"));
            if (n == 0) {
                break;
            } else if (right) {
                System.out.println("Stan is dishonest");
            } else {
                System.out.println("Stan may be honest");
            }

        } while (n != 0);//END ON WHILE

    }

}
