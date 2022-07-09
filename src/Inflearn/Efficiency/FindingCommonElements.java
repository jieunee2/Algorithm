package Inflearn.Efficiency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindingCommonElements {
    public ArrayList<Integer> Solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2])
                answer.add(a[p1++]);
            else if (a[p1] < b[p2])
                p1++;
            else
                p2++;
        }


        return answer;
    }

    public static void main(String[] args) throws Exception {
        FindingCommonElements f = new FindingCommonElements();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] b = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        for (int x : f.Solution(n, m, a, b)) {
            bw.write(x + " ");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
