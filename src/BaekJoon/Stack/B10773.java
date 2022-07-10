package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0)
                stack.push(n);
            else
                stack.pop();
        }
        for (int j = 0; j < stack.size(); j++)
            sum += stack.elementAt(j);

        System.out.println(sum);


    }
}


