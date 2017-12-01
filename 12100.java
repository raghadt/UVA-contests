package printer;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int counter = 0;
        boolean found = false;
        boolean yes = true;

        do {
            List<Integer> l = new ArrayList<Integer>();

            //yes = true;
            counter = 0;
            int d=0;

            int jobN = input.nextInt();
            int jobP = input.nextInt();

            for (int i = 0; i < jobN; i++) {
                l.add(input.nextInt());

            }

            while (true) {
                found = false;

                for (int i = 0; i < l.size()-1; i++) {
                    if (l.get(i+1) > l.get(0)) {
                        yes=true;
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    counter++;
                    yes=true;
                    l.remove(0);

                } else {
                    int temp = l.get(0);
                    l.remove(0);
                    l.add(temp);
                }

                if (jobP == 0 && !found) {
                    d++;
                    break;
                }

                jobP--;

                if (jobP < 0) {
                    jobP = l.size() - 1;
                }
            }

            System.out.println(counter);
            n--;

        } while (n != 0);

    }

}
