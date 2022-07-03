package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        String str = "";

        while (str.length() < n) {
            str = br.readLine();
        }

        for (int i = 0; i < str.length(); i++) {
            Character tmp = str.charAt(i);
            int t = Integer.parseInt(tmp.toString());

            sum += t;
        }

        bw.write(sum + "\n");

        bw.flush();
        br.close();
        bw.close();


    }
}
