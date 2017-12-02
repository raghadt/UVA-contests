package pkg10684;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean exit = true;

        while (true) {

            int n = input.nextInt();
            if (n == 0) {
                break;
            }
            int sum = 0;
            ArrayList<Integer> arr = new ArrayList();
            arr.add(0);
            int max = 0;
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();

                sum += num;
                if (sum < 0) {

                    sum = 0;
                }
                if (sum > max) {
                  //  max = sum;
                    arr.add(sum);
                }

            }
            //   System.out.println(arr);
                max = (Integer) Collections.max(arr);
            if (max == 0) {
                System.out.println("Losing streak.");
            } else {
                System.out.println("The maximum winning streak is " + max + ".");
            }

        }

    }

}
