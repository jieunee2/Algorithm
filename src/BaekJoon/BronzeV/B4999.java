package BaekJoon.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine(); // 재환이가 낼 수 있는 소리
        String s2 = br.readLine(); // 의사가 원하는 소리

        if (s1.contains(s2))
            System.out.println("go");
        else
            System.out.println("no");


    }
}
