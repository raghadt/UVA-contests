package spot;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int w = 0, h = 0, n = 0;

        do {
            w = input.nextInt();
            h = input.nextInt();
            n = input.nextInt();

            if (w == 0 && h == 0 && n == 0) {
                break;
            }
            boolean arr[][] = new boolean[w + 1][h + 1];

            for (int i = 0; i < n; i++) {
                int x1 = input.nextInt();
                int y1 = input.nextInt();
                int x2 = input.nextInt();
                int y2 = input.nextInt();

                for (int j = Math.min(x1, x2); j < Math.max(x1, x2) + 1; j++) {
                    for (int k = Math.min(y1, y2); k < Math.max(y1, y2) + 1; k++) {
                        arr[j][k] = true;
                    }
                }

            }
            int counter = 0;
            for (int i = 1; i < w + 1; i++) {
                for (int j = 1; j < h + 1; j++) {
                    if (!arr[i][j]) {
                        counter++;
                    }
                }
            }
            if (counter == 0) {
                System.out.println("There is no empty spots.");
            } else if (counter == 1) {
                System.out.println("There is one empty spot.");
            } else {
                System.out.println("There are " + counter + " empty spots.");
            }

        } while (true);

    }

}
