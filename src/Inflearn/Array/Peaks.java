package Inflearn.Array;

import java.util.Scanner;

public class Peaks {
    int[] dx = {-1, 0, 1, 0}; //x축 값 변화
    int[] dy = {0, 1, 0, -1}; //y축 값 변화

    public int Solution(int n, int[][] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean b = true;

                // 배열 dx, dy 와 비교하면서 탐색
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    // 가장자리에 있는 경우 범위를 벗어난 곳을 탐색하지 못하도록 조건 설정
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] >= arr[i][j])
                        b = false;

                }
                if (b)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Peaks p = new Peaks();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(p.Solution(n, arr));
    }
}
