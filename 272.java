import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean found = false;
        int m = 0;
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String str = input.nextLine();
            char[] chArr = str.toCharArray();
            m = str.length();
            char c;
            for (int i = 0; i < m; i++) {
                c = str.charAt(i);
                if (c == '\"' && !found) {
                    System.out.print("``");
                    found = true;

                } else if (c == '\"' && found) {
                    System.out.print("\'\'");
                    found = false;
                } else {
                    System.out.print(c);
                }
            }
            System.out.println("");
        }
    }

}
