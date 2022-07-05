package Inflearn.String;

import java.util.Scanner;

public class WordsInASentence {
    public String Solution(String str) {
        String answer = "";

        // 정수 m을 가장 작은 값으로 초기화
        int m = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos); // 공백이 나타나기 전까지 단어로 쪼갠다.
            int len = tmp.length(); // 쪼개진 단어의 길이

            // 가장 작은 값을 담는 과정
            if (len > m) {
                m = len;
                answer = tmp;
            }
            // 한 번 반복문이 끝나면 그 다음 반복문이 시작할 때, 공백 인덱스가 위치한 곳의 다음 인덱스부터 시작
            str = str.substring(pos + 1);
        }

        if (str.length() > m)
            answer = str;
        return answer;
    }

    public static void main(String[] args) {
        WordsInASentence w = new WordsInASentence();

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(w.Solution(str));

    }
}
