package BaekJoon.BronzeIV;

import java.time.LocalTime;
import java.util.Scanner;

public class B2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //시
        int b = sc.nextInt(); //분
        int c = sc.nextInt(); //초

        int t = sc.nextInt(); // 요리하는데 필요한 시간


        LocalTime l = LocalTime.of(a, b, c);

        l = l.plusSeconds(t);
        System.out.println(l.getHour() + " " + l.getMinute() + " " + l.getSecond());

    }
}
