package pkg572;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    static int[] di = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dj = {-1, 0, 1, -1, 1, -1, 0, 1};
    static boolean[][] arr2;
    static char[][] arr;
    static int m;
    static int n;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {

            m = input.nextInt();
            n = input.nextInt();

            if (m == 0) {
                break;
            }
            arr = new char[m][n];

            for (int i = 0; i < m; i++) {

                String st = input.next();

                for (int j = 0; j < n; j++) {
                    arr[i][j] = st.charAt(j);
                }

            }

            arr2 = new boolean[m][n];
            int counter = 0;

            for (int i = 0; i < m; i++) {

                for (int j = 0; j < n; j++) {

                    if (arr[i][j] == '@' && arr2[i][j] == false) {

                        counter++;

                        DFS(i, j);
                    }

                }

            }
            System.out.println(counter);

        } while (true);

    }

    public static void DFS(int x, int y) {
        arr2[x][y] = true;

        for (int i = 0; i < 8; i++) {

            int q = x + di[i];
            int p = y + dj[i];

            if ((q >= 0 && q < m)) {

                if ((p >= 0 && p < n)) {

                    if (arr2[q][p] == false) {

                        if (arr[q][p] == '@') {

                            DFS(q, p);

                        }
                    }
                }

            }

        }

    }

}
