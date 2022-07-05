package Inflearn.String;

import java.util.Scanner;

public class FindLetters {

    // 문자열에 해당 문자가 몇개 포함 되어있는지 찾는 메소드
    public int Solution(String str, Character c) {
        int numCnt = 0;

        // 입력 받을 문자열과 문자를 대문자로 변환
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (Character s : str.toCharArray()) { // toCharArray() : 문자열을 Character 배열로 변환
            if (s == c) {
                numCnt++;
            }
        }
        return numCnt;
    }

    public static void main(String[] args) {
        FindLetters f = new FindLetters();

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Character c = sc.next().charAt(0);

        System.out.println(f.Solution(str, c));

    }

}
