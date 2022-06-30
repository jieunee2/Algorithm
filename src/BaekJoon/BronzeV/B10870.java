package BaekJoon.BronzeV;

import java.util.Scanner;

public class B10870 {
    public int Solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return Solution(n - 1) + Solution(n - 2);
    }

    public static void main(String[] args) {
        B10870 b = new B10870();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(b.Solution(n));

    }
}
