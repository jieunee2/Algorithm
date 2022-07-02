package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10162 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); //T초

        int a = 0; // 5분 = 300초
        int b = 0; // 1분 = 60초
        int c = 0; // 10초

        while (t >= 10) {
            if (t >= 300) {
                t -= 300;
                a++;
            } else if (t >= 60) {
                t -= 60;
                b++;
            } else if (t >= 10) {
                t -= 10;
                c++;
            }
        }

        // 최종적으로 t==0일 경우 a,b,c 값을 출력, 그렇지 않을 경우 -1을 출력
        String res = (t == 0 ? a + " " + b + " " + c : "-1");
        bw.write(res);

        bw.flush();
        br.close();
        bw.close();
    }
}
