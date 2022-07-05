package Inflearn.String;

import java.util.Scanner;

public class ExtractOnlyNumbers {
    // #1. ASCII 코드를 이용
//    public int Solution(String str) {
//        int answer = 0;
//
//        for (char x : str.toCharArray()) {
//            if (x >= 48 && x <= 57) { // 48 ~ 57 = '0' ~ '9', 문자형 숫자를 나타냄
//                answer = answer * 10 + (x - 48); // answer에 10을 곱해서 10진수화 시킴
//            }
//        }
//        return answer;
//    }

    // #2. replaceAll 이용
    public int Solution(String str) {
        String answer = "";

        answer = str.replaceAll("[^0-9]", ""); // 숫자를 제외하고 전부 공백으로 처리

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        ExtractOnlyNumbers e = new ExtractOnlyNumbers();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(e.Solution(str));
    }
}
