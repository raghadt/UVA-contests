package phone;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {

            String st = input.next();

            char[] l = st.toCharArray();

            char[][] num = new char[8][24];

            for (int i = 0; i < l.length; i++) {
                if ((l[i] == 'A') || (l[i] == 'B') || (l[i] == 'C')) {
                    System.out.print("2");

                } else if ((l[i] == 'E') || (l[i] == 'F') || (l[i] == 'D')) {
                    System.out.print("3");
                } else if ((l[i] == 'H') || (l[i] == 'I') || (l[i] == 'G')) {
                    System.out.print("4");
                } else if ((l[i] == 'K') || (l[i] == 'L') || (l[i] == 'J')) {
                    System.out.print("5");
                } else if ((l[i] == 'M') || (l[i] == 'N') || (l[i] == 'O')) {
                    System.out.print("6");
                } else if ((l[i] == 'P') || (l[i] == 'Q') || (l[i] == 'R') || (l[i] == 'S')) {
                    System.out.print("7");
                } else if ((l[i] == 'T') || (l[i] == 'U') || (l[i] == 'V')) {
                    System.out.print("8");
                } else if ((l[i] == 'W') || (l[i] == 'X') || (l[i] == 'Y') || (l[i] == 'Z')) {
                    System.out.print("9");
                } else{
                    System.out.print(l[i]);
                }

            }

            System.out.println();

        } while (input.hasNext());

    }

}
