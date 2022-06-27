package Inflearn;

import java.util.Scanner;

public class Password {
    public String Solution(int n, String str) {
        String answer = "";

        // 입력받은 n개만큼 7글자씩 쪼개어 해당 반복문을 실행
        for (int i = 0; i < n; i++) {
            // 입력받은 문자열을 7글자씩 쪼갠 후, "#" -> "1"로, "*" -> "0" 으로 대체후 tmp에 담는다.
            String tmp = str.substring(0, 7).replace("#", "1").replace("*", "0");

            // 정수형 num 변수에 tmp에 담았던 문자열을 2진수 -> 10진수 로 변환 시켜 담는다.
            int num = Integer.parseInt(tmp, 2);

            // num을 char 형으로 변환시켜 answer에 담는다.
            answer += (char) num;

            str = str.substring(7);

        }
        return answer;
    }

    public static void main(String[] args) {
        Password p = new Password();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(p.Solution(n, str));
    }
}
