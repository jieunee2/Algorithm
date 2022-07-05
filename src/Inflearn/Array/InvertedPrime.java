package Inflearn.Array;

import java.util.Scanner;

public class InvertedPrime {

    // 소수인지 판별하는 메소드
    public boolean isPrime(int num) {
        if (num == 1)
            return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String Solution(int n, String s) {
        String answer = "";

        String[] temp = s.split(" ");

        for (int i = 0; i < temp.length; i++) {
            temp[i] = new StringBuilder(temp[i]).reverse().toString();
        }

        for (String x : temp) {
            if (isPrime(Integer.parseInt(x)))
                answer += String.valueOf(Integer.parseInt(x)) + " ";
        }

        return answer;
    }


    public static void main(String[] args) {
        InvertedPrime m = new InvertedPrime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println(m.Solution(n, s));
    }
}
