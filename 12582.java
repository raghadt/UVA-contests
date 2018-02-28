package pkg12582;

//NAADA + RAGHAD
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int counter = 0;

        do {

            Stack<Character> s = new Stack<Character>();
            TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
            ArrayList<Character> a = new ArrayList();
            counter++;
            String st = input.next();

            s.add(st.charAt(0));
            tm.put(st.charAt(0), 0);
            a.add(st.charAt(0));
            for (int i = 1; i < st.length(); i++) {

                if (s.peek() == st.charAt(i)) {
                    s.pop();
                } else {

                    char temp = s.peek();

                    int x = tm.get(temp);
                    tm.put(temp, x + 1);
                    s.add(st.charAt(i));
                    tm.put(st.charAt(i), 1);
                    a.add(st.charAt(i));
                }

            }
            
            Collections.sort(a);
            System.out.println("Case " + counter);
            for (int i = 0; i < a.size(); i++) {

                System.out.println(a.get(i) + " = " + tm.get(a.get(i)));

            }

            n--;
        } while (n != 0);

    }

}
