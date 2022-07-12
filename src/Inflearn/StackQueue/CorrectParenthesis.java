package Inflearn.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectParenthesis {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        String str = br.readLine();

        for (Character c : str.toCharArray()) {
            if (c.equals('(')) {
                stack.push(c);
            } else {
                int size = stack.size();
                if (size == 0) {
                    stack.push(c);
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (stack.empty())
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
