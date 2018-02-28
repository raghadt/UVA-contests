/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg280;

import java.util.*;

public class Main {

    static boolean[][] arr;
    static ArrayList<Integer> a = new ArrayList();
    static int verNum;
    static boolean[][] V;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            verNum = input.nextInt();
            if (verNum == 0) {
                break; //end all cases
            }
            arr = new boolean[verNum][verNum];
            V = new boolean[verNum][verNum];

            while (true) {
                int n = input.nextInt();
                if (n == 0) {
                    break;
                }
                while (true) {
                    int to = input.nextInt();
                    if (to == 0) {
                        break;
                    }
                    arr[n - 1][to - 1] = true;
                }

            }
            int b = input.nextInt();
            for (int i = 0; i < b; i++) {
                int x = input.nextInt();
                DFS(x - 1);
                /*  System.out.println("the array is "); 
                 for (int j = 0; j < a.size(); j++) {
                 System.out.println(a.get(i));
                 }*/

                for (int j = 0; j < a.size(); j++) {
                   // System.out.println("j is " + (j + 1));

                    if (!a.contains(j + 1)) {

                     System.out.print(a.get(j) + " ");
                    }
                  

                }
               
                a = new ArrayList();

                /*  for (int i = 0; i < verNum; i++) {
                 for (int j = 0; j < verNum; j++) {
                 System.out.print(arr[i][j] +" ");
                    
                    
                 }
                 System.out.println("");
                 }
                 */
            }
        } while (true);

    }

    static void DFS(int x) {

        for (int j = 0; j < arr.length; j++) {

            if (arr[x][j] && !V[x][j]) {
               System.out.print("j ");
               System.out.println(j+1);
                a.add(j + 1);
                //  System.out.println("x is " + x);
                //System.out.println("j is " + j);
                //System.out.println("--------------\n");
                V[x][j] = true;
                DFS(j);
            }

        }

    }

}
