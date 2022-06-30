package BaekJoon.BronzeV;

import java.io.*;

public class B14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 시간 초과 발생
//        BigInteger n = new BigInteger(br.readLine());
//        BigInteger d = new BigInteger("20000303");

//        bw.write((n.remainder(d).toString()));

        // 나머지 연산 방법 (해결 방안)
        String n = br.readLine();

        long remain = 0;


        for (int i = 0; i < n.length(); i++) {
            // remain * 10은 자릿수를 올려주는 역할
            remain = (remain * 10 + (n.charAt(i) - '0')) % 20000303; // '0'은 ASCII 코드로 48
        }

        bw.write(remain + "\n");
        bw.flush();

        br.close();
        bw.close();
    }
}
