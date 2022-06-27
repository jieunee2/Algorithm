package BaekJoon.BronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class B1271 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있음
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();

        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));


    }
}
