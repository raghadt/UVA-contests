package pkg10276;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int towerN = 0;
        int n1 =0;
        int num = 1;
        int temp = 0;
        boolean ns = true, find = false;


        for (int i = 0; i < n; i++) {

            towerN = input.nextInt();
            num = 1;
            int[] t = new int[towerN];
            int z = 0;

            while (z < towerN) {

                temp = t[z] + num;


                find = false;

                for (int j = 1; j * j <= temp; j++) {
                    if (j * j == temp || t[z] == 0) {

                        find = true;
                        break;
                    }
                }
                if (!find) {
                n1++;
                    z++;
                }
            }
            System.out.println(num - 1);
        }
    }
}
