package BaekJoon.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B8437 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n1 = new BigInteger(br.readLine());
        BigInteger n2 = new BigInteger(br.readLine());

        BigInteger d = new BigInteger("2");

        BigInteger k2 = n1.subtract(n2).divide(d);
        BigInteger k1 = k2.add(n2);

        System.out.println(k1);
        System.out.println(k2);


    }
}
