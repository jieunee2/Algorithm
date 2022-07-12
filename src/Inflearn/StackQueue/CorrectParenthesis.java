package Inflearn.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class CorrectParenthesis {
    public String Solution(String str) {
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c.equals('('))
                stack.push(c);
            else {
                // 스택이 비어있을 경우
                if (stack.empty())
                    return "NO";
                // 스택이 비어있지 않을 경우
                else
                    stack.pop();
            }
        }

        if (!stack.empty())
            return "NO";

        return answer;

    }

    public static void main(String[] args) throws Exception {
        CorrectParenthesis c = new CorrectParenthesis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();

        System.out.println(c.Solution(str));


    }
}
