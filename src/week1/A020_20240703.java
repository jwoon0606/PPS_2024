package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A020_20240703 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = 0;
        int max = 0;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int output = Integer.parseInt(st.nextToken());
            int input = Integer.parseInt(st.nextToken());
            count += input - output;
            if(count > 10000) count = 10000;
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
