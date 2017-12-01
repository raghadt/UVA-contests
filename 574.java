package pkg574;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Stack st = new Stack();

        // st.push(new Integer(a));
        //  Integer a = (Integer) st.pop();

        int t=0;
        int n=0;

        do {

            t = input.nextInt();
            n = input.nextInt();


            for (int i = 0; i < n; i++) {
                st.push((Integer)(input.nextInt()));

            }

            for (int i = 0; i < n; i++) {

                System.out.println();
            }

        } while (!(t==0&&t==0));

    }
}
