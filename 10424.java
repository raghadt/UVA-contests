package lovecalculator;

/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);    //scanner reader

        while (input.hasNextLine()) {
            //to lower case
            String name1 = input.nextLine();
            String name1L = name1.toLowerCase();

            String name2 = input.nextLine();
            String name2L = name2.toLowerCase();

            //String to char
            char[] char1 = name1L.toCharArray();
            char[] char2 = name2L.toCharArray();

//--------------------------------------------------------------------------------------------------------------------
            //char[] to int
            int sum1 = 0;

            for (char ch : char1) {

                if (ch >= 97 && ch <= 122) {
                    ch -= 96;
                    sum1 += ch;
                }

            }

            //single digit
            while (sum1 > 9) {

                sum1 = toSingleDigit(sum1);
            }
            double dsum1 = (double) sum1;
            //sum 2
            int sum2 = 0;
            for (char ch : char2) {
                if (ch >= 97 && ch <= 122) {
                    ch -= 96;
                    sum2 += ch;
                }
            }

            //single digit
            while (sum2 > 9) {

                sum2 = toSingleDigit(sum2);
            }

            double dsum2 = (double) sum2;

            //--------------------------------------------------------------------------------------------------------------------
            double ratio = 0.0;
            if (dsum1 > dsum2) {

                ratio = dsum2 / dsum1;
                ratio *= 100;
            } else {

                ratio = dsum1 / dsum2;
                ratio *= 100;
            }

            System.out.printf("%3.2f ", ratio);
            System.out.println("%");

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
