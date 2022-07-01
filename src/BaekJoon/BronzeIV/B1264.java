package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1264 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0; //모음의 개수
        String str = " ";

        while (true) {
            str = br.readLine();
            String tmp = str.toUpperCase();

            // "#"가 입력될 경우 입력 종료
            if (str.equals("#"))
                break;

            for (int i = 0; i < tmp.length(); i++) {
                if (tmp.charAt(i) == 'A')
                    cnt++;
                if (tmp.charAt(i) == 'E')
                    cnt++;
                if (tmp.charAt(i) == 'I')
                    cnt++;
                if (tmp.charAt(i) == 'O')
                    cnt++;
                if (tmp.charAt(i) == 'U')
                    cnt++;
            }
            bw.write(cnt + "\n");
            cnt = 0; //cnt 초기화
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
