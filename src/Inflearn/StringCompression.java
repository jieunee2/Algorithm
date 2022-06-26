package Inflearn;

import java.util.Scanner;

public class StringCompression {
    public String Solution(String str) {
        String answer = "";

        // index out of range 를 방지하기 위해 마지막에 빈 문자를 삽입
        str = str + " ";

        // 같은 문자열의 갯수를 세는 변수
        int cnt = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            // 현재 문자와 다음 문자가 동일할 경우
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            }
            // 동일하지 않을 경우,
            else {
                // 현재 문자를 answer에 삽입
                answer += str.charAt(i);

                // cnt가 1보다 클 경우, cnt 를 String으로 형 변환하여 현재 문자열 옆에 삽입
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }

                // 다시 cnt 값을 1로 초기화
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StringCompression s = new StringCompression();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(s.Solution(str));
    }

}
