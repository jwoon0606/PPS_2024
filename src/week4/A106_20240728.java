package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A106_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        StringTokenizer tokens;
        int T = Integer.parseInt(input.readLine());
        int alphabet = 26;
        for (int t = 0; t < T; t++) {
            String line = input.readLine();
            int sum = 0;
            boolean[] alpha = new boolean[alphabet];
            int N = line.length();
            for (int n = 0; n < N; n++) {
                alpha[line.charAt(n) - 'A'] = true;
            }
            for (int i = 0; i < alphabet; i++) {
                if (!alpha[i]) {
                    sum += i + 'A';
                }
            }
            output.append(sum).append("\n");
        }
        System.out.println(output);
    }
}