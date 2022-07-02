package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10808 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int alp[] = new int[26];
        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            alp[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < alp.length; i++) {
            System.out.print(alp[i] + " ");
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
