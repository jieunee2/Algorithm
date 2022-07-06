package Inflearn.Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class GetRank {
    public int[] Solution(int n, int arr[]) {
        int answer[] = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1; //등수 카운트
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) { // arr[i]는 현재 점수를 비교하는 기준값이 됨
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        GetRank g = new GetRank();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); //학생수
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : g.Solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
