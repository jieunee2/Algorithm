package Inflearn.String;

import java.util.Scanner;

public class PalindromeString {
    public String Solution(String str) {
        String answer = "YES";
        // # case 1
//        str = str.toUpperCase();
//        int len = str.length();
//
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) != str.charAt(len - i - 1)) {
//                answer = "NO";
//            }
//        }

        // # case 2
        String tmp = new StringBuilder(str).reverse().toString();

        if (!str.equalsIgnoreCase(tmp))
            answer = "NO";

        return answer;
    }

    public static void main(String[] args) {
        PalindromeString p = new PalindromeString();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(p.Solution(str));


    }
}
