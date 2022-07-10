package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();

        int T = Integer.parseInt(br.readLine()); //입력 데이터 수

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);

                if (c == '(')
                    stack.push(c);
                else {
                    // ')' 가 먼저 들어올 경우 size는 0이고, VPS가 아니기 때문에 push 해준 후 바로 break 처리
                    int size = stack.size();
                    if (size == 0) {
                        stack.push(c);
                        break;
                    }
                    // ')'가 들어올 경우 pop을 진행
                    else {
                        stack.pop();
                    }
                }
            }

            if (stack.empty())
                System.out.println("YES");
            else
                System.out.println("NO");

            stack.clear();
        }

        br.close();

    }
}
