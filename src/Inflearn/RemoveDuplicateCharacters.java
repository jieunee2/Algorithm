package Inflearn;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public String Solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            // indexOf 함수를 사용해서 해당 문자가 첫 번째로 나타난 위치와 현재 위치를 비교하여,
            // 위치가 같을 경우 answer 에 하나씩 추가한다.
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicateCharacters r = new RemoveDuplicateCharacters();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(r.Solution(str));
    }
}
