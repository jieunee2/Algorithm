package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

// push X: 정수 X를 스택에 넣는 연산이다.
// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 스택에 들어있는 정수의 개수를 출력한다.
// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
// top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

public class B10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));

            if (s.equals("pop")) {
                if (stack.empty())
                    sb.append(-1 + "\n");
                else
                    sb.append(stack.pop() + "\n");
            }

            if (s.equals("size")) {
                sb.append(stack.size() + "\n");
            }

            if (s.equals("empty")) {
                if (stack.empty())
                    sb.append(1 + "\n");
                else
                    sb.append(0 + "\n");
            }

            if (s.equals("top")) {
                if (stack.empty())
                    sb.append(-1 + "\n");
                else
                    sb.append(stack.peek()+"\n"); //peek() : 맨 위에 물건을 제거하지 않고 반환하는 함수
            }
        }
        bw.write(sb + " ");

        bw.flush();
        br.close();
        bw.close();


    }
}
