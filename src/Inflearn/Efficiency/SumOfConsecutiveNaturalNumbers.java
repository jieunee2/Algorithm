package Inflearn.Efficiency;

import java.util.Scanner;

public class SumOfConsecutiveNaturalNumbers {
    public int Solution(int n) {
        int answer = 0, sum = 0, p1 = 0;
        int m = n / 2 + 1; //연속된 자연수의 합이 나올수 있는 범위

        for (int i = 0; i <= m; i++) {
            sum += i;
            while (sum > n)
                sum -= p1++;

            if (sum == n)
                answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        SumOfConsecutiveNaturalNumbers s = new SumOfConsecutiveNaturalNumbers();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(s.Solution(n));


    }
}
