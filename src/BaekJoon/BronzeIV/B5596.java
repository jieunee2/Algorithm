package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B5596 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int arr1[] = new int[4]; // 민국이의 점수를 담을 배열
        int arr2[] = new int[4]; // 민세의 점수를 담을 배열

        int s1 = 0; // 민국이의 점수 합
        int s2 = 0; // 만세의 점수 합

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
            s1 += arr1[i];
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
            s2 += arr2[i];
        }

        bw.write(Math.max(s1, s2) + "\n");

        bw.flush();
        br.close();
        bw.close();


    }
}
