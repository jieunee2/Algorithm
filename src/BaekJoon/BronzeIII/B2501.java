package BaekJoon.BronzeIII;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B2501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //자연수
        int k = Integer.parseInt(st.nextToken()); //k번째로 작은 수

        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }

        if (k > arr.size())
            bw.write("0" + "\n");
        else
            bw.write(arr.get(k - 1) + "\n");

        bw.flush();
        br.close();
        bw.close();
    }
}

