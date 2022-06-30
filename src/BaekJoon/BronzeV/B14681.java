package BaekJoon.BronzeV;

import java.io.*;

public class B14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine()); // 정수 x
        int y = Integer.parseInt(br.readLine()); // 정수 y

        if (x > 0 && y > 0)
            bw.write("1");
        else if (x < 0 && y > 5)
            bw.write("2");
        else if (x < 0 && y < 0)
            bw.write("3");
        else
            bw.write("4");

        bw.flush();

        br.close();
        bw.close();

    }
}
