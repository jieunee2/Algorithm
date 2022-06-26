package Inflearn;

import java.util.Scanner;

public class CharacterDistance {
    public int[] Solution(String str, char c) {
        int[] answer = new int[str.length()];

        // 거리를 구하기 위해 p 값을 1000으로 초기화한다.
        int p = 1000;

        // c로부터의 거리를 왼쪽부터 탐색
        for (int i = 0; i < str.length(); i++) {
            // str의 문자열 탐색 시, c와 같을 경우 p에 0을 대입
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            }
            // 다를 경우, p값 증가
            else {
                p++;
                answer[i] = p;
            }
        }

        // p값 다시 1000으로 초기화
        p = 1000;

        // c로부터의 거리를 오른쪽부터 탐색
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c)
                p = 0;
            else {
                p++;
                // 기존에 있던 값과 새로 들어온 p 값을 비교해서 더 작은 값을 배열에 대입
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CharacterDistance t = new CharacterDistance();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int x : t.Solution(str, c)) {
            System.out.print(x + " ");
        }

    }
}
