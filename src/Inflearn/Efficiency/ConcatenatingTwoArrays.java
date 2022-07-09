package Inflearn.Efficiency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ConcatenatingTwoArrays {
    public ArrayList<Integer> Solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        // p1, p2가 둘다 배열의 크기 전까지 돌도록 설정
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2])
                answer.add(a[p1++]); // ++가 뒤에 붙는 이유 : answer에 값을 add 하고 p 값을 증가시키기 위해서
            else
                answer.add(b[p2++]);
        }

        // 배열에 아직 값이 남아있는 경우
        while (p1 < n)
            answer.add(a[p1++]);

        while (p2 < m)
            answer.add(b[p2++]);


        return answer;
    }

    public static void main(String[] args) throws Exception {
        ConcatenatingTwoArrays c = new ConcatenatingTwoArrays();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++)
            a[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b.length; i++)
            b[i] = Integer.parseInt(st.nextToken());

        for (int x : c.Solution(n, m, a, b)) {
            bw.write(x + " ");
        }


        bw.flush();
        br.close();
        bw.close();

    }
}
