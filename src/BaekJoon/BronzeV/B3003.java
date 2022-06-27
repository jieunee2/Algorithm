package BaekJoon.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[6];
        int answer[] = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(answer[i] - arr[i] + " ");
        }


    }
}
