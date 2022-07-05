package Inflearn.String;

import java.util.ArrayList;
import java.util.Scanner;

public class WordFlip {
    public ArrayList<String> solution(int n, String str[]) {
        ArrayList<String> answer = new ArrayList<>();

        // #1. StringBuilder 이용
        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString(); // StringBuilder 를 이용해서 reverse 메소드를 사용하여 문자열을 뒤집는다.
            answer.add(tmp); // 뒤집은 문자열을 answer ArrayList에 담는다.
        }

//        // #2. 직접 뒤집기
//        for (String s : str) {
//            char[] c = s.toCharArray();
//
//            int l = 0; // 시작 index
//            int r = s.length() - 1; // 마지막 index
//
//            while (l < r) {
//                char tmp = c[l];
//                c[l] = c[r];
//                c[r] = tmp;
//                l++;
//                r--;
//            }
//
//            // valueOf 메소드를 통해서 String으로 형 변환
//            String tmp = String.valueOf(c);
//            answer.add(tmp);
//        }

        return answer;
    }

    public static void main(String[] args) {
        WordFlip w = new WordFlip();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (String s : w.solution(n, str)) {
            System.out.println(s);
        }

    }
}
