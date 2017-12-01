package rev;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //String reverse = new StringBuffer(string).reverse().toString();
        int n;
        int counter = 0;

        do {
            String st = "";

            String rev = "";

            String nst = "";

            n = input.nextInt();

            if (n <= 9 && n != 0) {

                st = input.next();

                int slen = st.length() / n;

                for (int j = 0; j < st.length(); j += slen) {

                    rev = new StringBuffer(st.substring(j, j + slen)).reverse().toString();

                    nst += rev;

                }

                System.out.println(nst);

            } else {
                break;
            }

            counter++;
            /* if (counter == 101) {
             break;
             }*/
        } while (n != 0);

    }

}
