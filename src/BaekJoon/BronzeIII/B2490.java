package BaekJoon.BronzeIII;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2490 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c1 = 0; // 0 개수
        int c2 = 0; // 1 개수
        String str = "";

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            str += String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d);

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0')
                    c1++;
                else
                    c2++;
            }

            if (c1 == 1)
                System.out.println("A");
            else if (c1 == 2)
                System.out.println("B");
            else if (c1 == 3)
                System.out.println("C");
            else if (c1 == 4)
                System.out.println("D");
            else System.out.println("E");

            str = "";
            c1 = 0;
            c2 = 0;

        }

    }
}
