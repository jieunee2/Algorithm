package Inflearn.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class RemoveParentheses {
    public String Solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c.equals(')')) {
                while (stack.pop() != '(') ; //문자가 '(' 일때까지 pop
            } else {
                stack.push(c);
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }


        return answer;
    }

    public static void main(String[] args) throws Exception {
        RemoveParentheses r = new RemoveParentheses();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        System.out.println(r.Solution(str));


    }
}
