package BaekJoon.BronzeV;

import java.util.Scanner;

public class B2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] += sc.nextInt();
                }
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


//        ArrayList<Integer> a = new ArrayList<>();
//        ArrayList<Integer> b = new ArrayList<>();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                int t1 = sc.nextInt();
//                a.add(t1);
//            }
//        }
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                int t2 = sc.nextInt();
//                b.add(t2);
//            }
//        }
//
//
//        for (int i = 0; i < a.size(); i++) {
//            int sum = a.get(i) + b.get(i);
//            System.out.print(sum + " ");
//        }
//
//        System.out.println();

    }
}
