package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B11948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;

        int sco1[] = new int[4];

        for (int i = 0; i < sco1.length; i++) {
            sco1[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(sco1);

        int sco2[] = new int[2];

        for (int i = 0; i < sco2.length; i++) {
            sco2[i] = Integer.parseInt(br.readLine());
        }

        int m = Math.max(sco2[0], sco2[1]);

        sum = sco1[3] + sco1[2] + sco1[1] + m;
        bw.write(sum + "\n");

        bw.flush();
        br.close();
        bw.close();

    }
}
