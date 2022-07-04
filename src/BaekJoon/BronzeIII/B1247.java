package BaekJoon.BronzeIII;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class B1247 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger s = new BigInteger("0");

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 0; j < n; j++) {
                BigInteger k = new BigInteger(br.readLine());
                s = s.add(k);
            }

            if (s.signum() == -1)
                System.out.println("-");
            else if (s.signum() == +1)
                System.out.println("+");
            else
                System.out.println("0");

            s = new BigInteger("0"); // 합계 s를 0으로 다시 초기화

        }

        bw.flush();
        br.close();
        bw.close();

    }
}
