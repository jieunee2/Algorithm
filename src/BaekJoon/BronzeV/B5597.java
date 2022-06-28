package BaekJoon.BronzeV;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class B5597 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr1 = new ArrayList<Integer>(); // 모든 학생의 번호를 담은 리스트
        ArrayList<Integer> arr2 = new ArrayList<Integer>(); // 출석한 학생의 번호를 담은 리스트

        for (int i = 1; i <= 30; i++) {
            arr1.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr2.add(n);
            arr2.sort(Comparator.naturalOrder());
        }

        // 전체 학생 리스트에서 출석한 학생의 리스트를 제거
        arr1.removeAll(arr2);

        for (Integer a : arr1) {
            System.out.println(a);
        }
    }
}

