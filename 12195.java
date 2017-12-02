package pkg12195;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        TreeMap tm = new TreeMap();

        tm.put("W", new Double(1));
        tm.put("H", new Double(0.5));
        tm.put("Q", new Double(0.25));
        tm.put("E", new Double(0.125));
        tm.put("S", new Double(0.0625));
        tm.put("T", new Double(0.03125));
        tm.put("X", new Double(0.015625));

        do {

            String st = input.next();
            if (st.equals("*")) {
                break;
            }

            char[] c = st.toCharArray();

            int count = 0;
            double music = 0;

            for (int i = 1; i < c.length; i++) {
                if (!(c[i] == '/')) {
                  //double balance = ((Double)tm.get("Zara")).doubleValue();

                    music += ((Double) tm.get(String.valueOf(c[i]))).doubleValue();

                } else {
                   // System.out.println(music);
                    if (music == 1) {
                        count++;
                    }
                    music = 0;
                }
            }
            System.out.println(count);

        } while (true);

    }

}
