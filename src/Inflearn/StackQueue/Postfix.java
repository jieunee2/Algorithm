package Inflearn.StackQueue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix {
    public int Solution(String str) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (Character c : str.toCharArray()) {
            // 숫자일 경우
            if (Character.isDigit(c)) {
                stack.push(c - 48);
            }
            // 숫자가 아닐 경우
            else {
                int rt = stack.pop(); //먼저 들어온 문자
                int lt = stack.pop(); //나중에 들어온 문자

                if (c.equals('+'))
                    stack.push(lt + rt);
                else if (c.equals('-'))
                    stack.push(lt - rt);
                else if (c.equals('*'))
                    stack.push(lt * rt);
                else if (c.equals('/'))
                    stack.push(lt / rt);
            }
        }

        answer += stack.peek();

        return answer;
    }

    public static void main(String[] args) throws Exception {
        Postfix c = new Postfix();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(c.Solution(str));

    }
}




