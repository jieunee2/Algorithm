package BaekJoon.BronzeIII;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2010 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //멀티탭의 개수
        int s = 0;

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine()); //각 멀티탭의 플러그 개수
            s += k;
        }

        bw.write(s - (n - 1) + "\n");

        bw.flush();
        br.close();
        bw.close();


    }
}
