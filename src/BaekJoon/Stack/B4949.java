package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";
        Stack<Character> stack = new Stack<>(); //부호를 담을 스택
        int length = 0;

        str = br.readLine();
        while (!str.equals(".")) {
            stack.clear();

            length = str.length();


            for (Character c : str.toCharArray()) {
                if (c.equals('(') || c.equals('[')) {
                    stack.push(c);
                } else if (c.equals(')') && !stack.empty() && stack.peek().equals('(')) {
                    stack.pop();
                } else if (c.equals(']') && !stack.empty() && stack.peek().equals('[')) {
                    stack.pop();
                } else if (c.equals(']') || c.equals(')'))
                    stack.push(c);
            }

            if (stack.empty())
                System.out.println("yes");
            else
                System.out.println("no");

            str = br.readLine();

        }
    }
}


