package BaekJoon.BronzeIII;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2455 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); // 내린 사람 수
        int b = Integer.parseInt(st.nextToken()); // 탄 사람 수
        arr[0] = a + b;

        for (int i = 1; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            arr[i] = arr[i - 1] - a + b;

        }
        Arrays.sort(arr);
        bw.write(arr[3] + "\n");

        bw.flush();
        br.close();
        bw.close();


    }
}
