package Inflearn.Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Decimal {
    public int Solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1]; //n번 인덱스까지 만들기 위해서 +1을 해줌

        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) { // arr[i]==0 이면 소수라는 의미로 answer 1 증가
                answer++;
                // i의 배수들을 탐색하여 배열값에 1을 넣어준다.
                for (int j = i; j <= n; j = j + i) {
                    arr[j] = 1;
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        Decimal d = new Decimal();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        System.out.println(d.Solution(n));

    }
}
