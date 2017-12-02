package pkg484;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String l;
        ArrayList<Integer> a = new ArrayList();
        TreeMap<Integer, Integer> tm = new <Integer, Integer>  TreeMap();

       while (input.hasNext()) {

            int n = input.nextInt();
            int x;
            if (tm.containsKey(n)) {
                x = tm.get(n);
                tm.put(n, x + 1);
            } else {
                tm.put(n, 1);
                a.add(n);

            }


        }

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " "+ tm.get(a.get(i)));

        }



    }
}
