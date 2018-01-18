package languagedediction;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String c = input.next();
        int counter = 1;

        while (!c.equals("#")) {

            switch (c) {
                case "HELLO":
                    System.out.println("Case " + counter + ": ENGLISH");
                    counter++;
                    break;
                case "HOLA":
                    System.out.println("Case " + counter + ": SPANISH");
                    counter++;
                    break;
                case "HALLO":
                    System.out.println("Case " + counter + ": GERMAN");
                    counter++;
                    break;
                case "BONJOUR":
                    System.out.println("Case " + counter + ": FRENCH");
                    counter++;
                    break;
                case "CIAO":
                    System.out.println("Case " + counter + ": ITALIAN");
                    counter++;
                    break;
                case "ZDRAVSTVUJTE":
                    System.out.println("Case " + counter + ": RUSSIAN");
                    counter++;
                    break;
                default:
                    System.out.println("UNKNOWN");
                    break;
            }


            c = input.next();
        }

    }
}
