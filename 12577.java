
package hajj;

/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Hajj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String c = input.next();
        int counter = 1;

        while (!c.equals("*")) {

            if (c.equals("Hajj")) {

                System.out.println("Case "+counter+": Hajj-e-Akbar");

            } else {


                System.out.println("Case "+counter+": Hajj-e-Asghar");

            }

            counter++;


            c=input.next();
        }


    }

}
