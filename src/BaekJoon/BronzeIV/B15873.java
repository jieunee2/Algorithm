package BaekJoon.BronzeIV;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B15873 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        if (n.equals("1010"))
            System.out.println("20");
        else if (Integer.parseInt(n) / 10 == 10) {
            System.out.println(10 + Integer.parseInt(String.valueOf(n.charAt(2))));
        } else if (Integer.parseInt(n) % 10 == 0) {
            System.out.println(10 + Integer.parseInt(String.valueOf(n.charAt(0))));
        } else {
            System.out.println(Integer.parseInt(String.valueOf(n.charAt(0))) + Integer.parseInt(String.valueOf(n.charAt(1))));
        }


    }
}
