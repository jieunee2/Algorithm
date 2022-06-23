package Inflearn;

import java.util.Scanner;

public class Palindrome {
    public String Solution(String str) {
        String answer = "NO";

        // 입력받은 문자열을 전부 대문자로 변환 후, 정규식을 이용하여 대문자가 아닌 것들을 공백으로 변환
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp))
            answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(p.Solution(str));
    }
}
