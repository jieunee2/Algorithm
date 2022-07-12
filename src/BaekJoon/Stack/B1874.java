package BaekJoon.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class B1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //입력할 수의 개수 n

        Stack<Integer> stack = new Stack<>();
        ArrayList<String> str = new ArrayList<>(); //부호 저장 리스트
        ArrayList<Integer> arr = new ArrayList<>(); //입력받은 수를 저장할 arr

        int p = 0;

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            arr.add(k);
        }

        for (int i = 0; i < n; i++) {
            stack.push(i + 1);
            str.add("+");

            while (!stack.empty()) {
                // stack의 top과 arr 값이 같을 경우 stack에서 해당 값을 꺼내고 str에 "-" 부호를 추가
                if (stack.peek().equals(arr.get(p))) { // stack과 arrayList 둘 다 Integer 이기 때문에 equals or compareTo로 비교해야 함
                    stack.pop();
                    str.add("-");
                    p++;
                } else {
                    break;
                }
            }
        }

        // 스택이 비어있지 않으면 수열을 만들 수 없다는 의미
        if (!stack.empty()) {
            System.out.println("NO");
        }
        // 그렇지 않을 경우 저장된 부호 리스트 출력
        else {
            for (String i : str) {
                System.out.println(i);
            }
        }

        br.close();

    }
}

