package Inflearn.Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ScoreCalculation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 문제의 개수
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int cnt = 0;

        int tmp[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                cnt++;
                tmp[i] = cnt;
            } else if (arr[i] == 0) {
                cnt = 0;
                tmp[i] = cnt;
            }
        }

        int sum = 0;

        for (Integer i : tmp) {
            sum += i;
        }

        bw.write(sum + "");

        bw.flush();
        br.close();
        bw.close();


    }
}
