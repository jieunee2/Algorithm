package BaekJoon.BronzeV;

import java.util.Scanner;

public class B2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                answer += String.valueOf(str.charAt(i)).toLowerCase();

            else
                answer += String.valueOf(str.charAt(i)).toUpperCase();
        }

        System.out.println(answer);
    }
}
