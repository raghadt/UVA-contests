package pkg1203;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
        ArrayList<Integer> a = new ArrayList();
        ArrayList<Integer> b = new ArrayList();
        while (true) {

            String st = input.next();
            if (st.equals("#")) {
                break;
            }
            a.add(input.nextInt());
            b.add(input.nextInt());
            //   tm.put(input.nextInt(), input.nextInt());

        }

        /*    for (int i = 0; i < a.size(); i++) {
         System.out.println(b.get(i));
         }*/
        // Collections.sort(b);
        //  Collections.sort(a);
        int n = input.nextInt();

        int min = Collections.min(b);
        for (int i = min; i < 9999; i++) {
            ArrayList<Integer> c = new ArrayList();
            for (int j = 0; j < b.size(); j++) {

                //  System.out.println("hh");
                //  System.out.println("i ("+i+") % "+ b.get(j) +" = "+i %b.get(j));
                if (i % b.get(j) == 0) {
                    c.add(a.get(j));
                 //   System.out.println();
                    if (--n == 0) {
                        break;
                    }
                }

            }
            Collections.sort(c);
            for (int j = 0; j < c.size(); j++) {
                System.out.println(c.get(j));

            }

            if (n == 0) {
                break;
            }
        }

    }

}
