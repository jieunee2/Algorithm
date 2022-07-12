package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B17413 {
    public StringBuilder Solution(String s) {
        String answer = "";

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int now = 0;

        while (true) {
            if (s.charAt(now) == '<') {
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }

                while (true) {
                    sb.append(s.charAt(now));
                    now++;

                    // '>' 가 나오면 sb에 추가 후 while문 종료
                    if (s.charAt(now) == '>') {
                        sb.append(s.charAt(now));
                        now++;
                        break;
                    }
                }
            } else if (s.charAt(now) == ' ') {
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
                sb.append(' ');
                now++;
            } else {
                stack.add(s.charAt(now));
                now++;
            }

            if (now == s.length()) {
                while (!stack.empty()) {
                    sb.append(stack.pop());
                }
                break;
            }
        }

        return sb;
    }

    public static void main(String[] args) throws Exception {
        B17413 b = new B17413();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        System.out.println(b.Solution(s));

    }
}
