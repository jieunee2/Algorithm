package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;

public class B10768 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine()); //월
        int d = Integer.parseInt(br.readLine()); //일

        LocalDate l = LocalDate.of(0, m, d); // 입력 날짜
        LocalDate p = LocalDate.of(0, 2, 18); // 기준 날짜

        if (p.isAfter(l))
            bw.write("Before");
        else if (p.isBefore(l))
            bw.write("After");
        else
            bw.write("Special");

        bw.flush();
        br.close();
        bw.close();


    }
}
