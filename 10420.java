package conquer;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        String[] country = new String[n];
        String name;
        int counter = 0;

        for (int i = 0; i < n; i++) {

            country[i] = input.next();

            name = input.next();
            name = input.next();

        }

        Arrays.sort(country);

        String temp = null;

        for (int i = 0; i < n; i++) {
            counter = 0;
            if (!country[i].equals(temp)) {

                for (int j = 0; j < n; j++) {

                    if (country[i].equals(country[j])) {
                        counter++;
                    }

                }

            } else {
                continue;
            }

            temp = country[i];
            //  System.out.println(temp + " " + counter);
            System.out.printf("%s %d\n", temp, counter);

        }

    }
}
