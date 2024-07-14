package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A033_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] sum = new int[5];
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                sum[i] += Integer.parseInt(st.nextToken());
            }
        }
        int max = 0;
        int maxi = 0;
        for (int i = 0; i < 5; i++) {
            if (sum[i] > max) {
                maxi = i + 1;
                max = sum[i];
            }
        }
        System.out.println(maxi + " " + max);
    }
}
