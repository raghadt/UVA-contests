package pkg11369;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    static Stack st = new Stack();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int k = 0; k < n; k++) {
           int counter=0;



            int c = input.nextInt();

            int[] arr = new int[c];


            for (int i = 0; i < c; i++) {
                arr[i] = input.nextInt();

            }

            Arrays.sort(arr);

            for (int i = 0; i < c; i++) {
int d= (Integer) arr[i];
                st.push(d);
            }

            int countter = 0;
/*
  for (int j = c; j > 0; j--) {
int popin=(Integer) st.pop();
                countter += popin

            }
*/


            for (int j = c; j > 0; j -= 3) {

  //              st.pop();
//                st.pop();
int popin=(Integer) st.pop();
                countter += popin
          //   System.out.println("counterr "+counter);

            }

            for (int j = c - 3; j >= 0; j -= 3) {
            //st.pop();


                counter += arr[j];
            }

            System.out.println(counter);

        }


    }

}
