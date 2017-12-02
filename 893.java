package pkg893;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] in = new int[4];
        do {
            int[] mDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int incValue = input.nextInt();
            for (int i = 0; i < 3; i++) {
                in[i] = input.nextInt();
            }

            GregorianCalendar cal = new GregorianCalendar(in[2], in[0] - 1, in[1]);

            if (in[0] == 0 && in[1] == 0 && in[2] == 0) {
                break;
            }
            //check if it's a leap year
            if (leapYear(in[2])) {
                mDays[1] = 29;

            } else {
                mDays[1] = 28;
            }
            Date d = new Date();

            GregorianCalendar ca = new GregorianCalendar(in[2], in[0] - 1, in[1]);

            cal.add(Calendar.DATE, incValue);
            //    System.out.println("hello " + Calendar.DATE);
            System.out.print(cal.get(Calendar.DATE) + " ");
            System.out.print((cal.get(Calendar.MONTH) + 1) + " ");
            System.out.print(cal.get(Calendar.YEAR));
            System.out.println("");

        } while (true);

    }

    public static boolean leapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

}
