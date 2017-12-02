package pkg12488;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();

            ArrayList<Integer> arr1 = new ArrayList();
            ArrayList<Integer> arr2 = new ArrayList();
            for (int i = 0; i < n; i++) {
                arr1.add(input.nextInt());

            }

            for (int i = 0; i < n; i++) {
                arr2.add(input.nextInt());

            }

            int counter = 0;
            int temp=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < arr2.size(); j++) {
                    if (arr1.get(i) == arr2.get(j)) {
                        System.out.println(j);
                        counter+=j;
                           arr2.remove(j);
                        break;

                    }

                }





            }

            System.out.println(counter);

        }

    }

}
