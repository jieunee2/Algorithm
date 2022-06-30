package BaekJoon.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로
        int k = Integer.parseInt(st.nextToken()); // 잃어버린 관중석 번호

        System.out.println(k / m + " " + k % m);
//        System.out.println(Arrays.deepToString(arr)); // 배열의 문자열을 전부 출력
    }
}

