package Inflearn.Array;

import java.util.Scanner;

public class GridMaxSum {
    public int Solution(int n, int arr[][]) {
        int answer = 0;
        int sum1, sum2;

        // 행과 열의 합 최대값 구하기
        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j]; //행의 합
                sum2 += arr[j][i]; //열의 합
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }

        sum1 = 0;
        sum2 = 0;
        // 대각선의 합 최대값 구하기
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i]; //왼쪽부터 시작하는 대각선
            sum2 += arr[i][n - i - 1]; //오른쪽부터 시작하는 대각선

            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        GridMaxSum g = new GridMaxSum();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(g.Solution(n, arr));


    }
}
