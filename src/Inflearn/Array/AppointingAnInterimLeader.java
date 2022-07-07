package Inflearn.Array;

import java.util.Scanner;

public class AppointingAnInterimLeader {
    public int Solution(int n, int arr[][]) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) { // i번째 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) { // i번째와 비교할 j번째 학생
                for (int k = 1; k <= 5; k++) { // 1반부터 5반을 의미
                    if (arr[i][k] == arr[j][k]) { // i번째 학생의 k학년과 반과 j번째 학생의 k학년의 반이 같을 경우
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AppointingAnInterimLeader a = new AppointingAnInterimLeader();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생수
        int arr[][] = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(a.Solution(n, arr));
    }
}
