package Inflearn;

import java.util.Scanner;

public class CaseConversion {
    public String Solution(String str) {
        String word = "";

        // ASCII 코드를 활용한 방법
//        for (char c : str.toCharArray()) {
//            if (c >= 97 && c < 122)
//                word += (char) (c - 32);
//            else
//                word += (char) (c + 32);
//        }

        // isLowerCase 함수를 활용한 방법
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c))
                word += Character.toUpperCase(c);
            else
                word += Character.toLowerCase(c);
        }
        return word;
    }

    public static void main(String[] args) {
        CaseConversion c = new CaseConversion();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(c.Solution(str));

    }
}