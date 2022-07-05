package Inflearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class StudentWhoSees {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int max = 0;
        int cnt = 1;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = arr[0];
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                if (arr[i] > max) {
                    max = arr[i];
                    cnt++;
                }
        }

        bw.write(cnt + "");

        bw.flush();
        br.close();
        bw.close();

    }
}
