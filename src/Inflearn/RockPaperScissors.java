package Inflearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RockPaperScissors {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 가위 : 1, 바위 : 2, 보 : 3

        int n = Integer.parseInt(br.readLine()); //게임 횟수

        int a[] = new int[n]; //A 결과
        int b[] = new int[n]; //B 결과

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // A가 이기는 경우를 기준
        for (int i = 0; i < n; i++) {
            if (a[i] == 2 && b[i] == 1)
                System.out.println("A");
            else if (a[i] == 3 && b[i] == 2)
                System.out.println("A");
            else if (a[i] == 1 && b[i] == 3)
                System.out.println("A");
            else if (a[i] == b[i])
                System.out.println("D");
            else
                System.out.println("B");
        }
    }
}
