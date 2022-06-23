package Inflearn;

import java.util.Scanner;

public class FlipSpecificCharacters {
    public String solution(String str) {
        String answer = "";
        char c[] = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            // 문자가 알파벳이 아닐 경우 왼쪽에서 배열 1씩 증가
            if (!Character.isAlphabetic(c[lt])) {
                lt++;
            }
            // 문자가 알파벳이 아닐 경우 오른쪽에서 배열 1씩 감소
            else if (!Character.isAlphabetic(c[rt])) {
                rt--;
            }
            // 문자가 알파벳일 경우 서로 자리 교환
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }
        }

        // String으로 변환하여 answer에 저장
        answer = String.valueOf(c);

        return answer;
    }

    public static void main(String[] args) {
        FlipSpecificCharacters f = new FlipSpecificCharacters();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(f.solution(str));

    }
}
