package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11365 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            String pw = br.readLine();

            if (pw.equals("END")) {
                break;
            }

            String sb = new StringBuilder(pw).reverse().toString();

            bw.write(sb+"\n");

        }


        bw.flush();

        br.close();
        bw.close();

    }
}

