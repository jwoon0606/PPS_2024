package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A017_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[10];
        char[] input = br.readLine().toCharArray();
        for (char c : input) {
            int a = c - '0';
            count[a]++;
        }
        count[6] = (count[6] + count[9]) / 2 + (count[6] + count[9]) % 2;

        int max = 0;
        for (int i=0; i<9; i++) {
            int a = count[i];
            max = Math.max(max,a);
        }

        System.out.println(max);

    }
}
