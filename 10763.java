package pkg10763;
/**
@author: Raghad Taleb
github: https://github.com/raghadt
**/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {

            int n = input.nextInt();
            if(n==0){
                break;
            }
            int[] o = new int[n];
            int[] t = new int[n];

            for (int i = 0; i < n; i++) {
                o[i] = input.nextInt();
                t[i] = input.nextInt();
            }

            Arrays.sort(o);
            Arrays.sort(t);

            boolean found=true;

            for (int i = 0; i < n; i++) {
                if(o[i]!=t[i]){
                    found=false;
                    break;
                }
            }

            if(found){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }


        } while (true);

    }

}
