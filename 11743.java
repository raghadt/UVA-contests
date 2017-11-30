package credit;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while (n != 0) {

            String st = input.next();
            String ccn =st;

            for (int i = 1; i < 4; i++) {
               st = input.next();
              ccn= ccn+st;

            }

            char[] c_arr = ccn.toCharArray();


            int[] odd = new int[8];
            int[] even = new int[8];

            int sumO = 0;
            int sumE = 0;

            for (int i = 0, j = 0; i < 16; i += 2, j++) {

                odd[j] = Character.getNumericValue(c_arr[i]);

                even[j] = Character.getNumericValue(c_arr[i + 1]);
             //   System.out.println("odd " + odd[j]);

              //  System.out.println("even " + even[j]);
                odd[j] *= 2;
                // System.out.println("doubleee" + odd[j]);
                if (odd[j] > 9) {
                    odd[j] = toSingleDigit(odd[j]);
                }

                sumO += odd[j];
                sumE += even[j];

            }
      //      System.out.println(sumO);
            //    System.out.println(sumE);

            int total = 0;
            total = sumO + sumE;
            if (total % 10 == 0) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

            n--;
        }
    }

    public static int toSingleDigit(int sum) {
        int sum2 = 0;
        while (sum > 0) {

            sum2 = sum2 + sum % 10;
            sum = sum / 10;

        }
        return sum2;
    }

}
