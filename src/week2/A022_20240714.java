package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A022_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            s1 += (a/30 + 1) * 10;
            s2 += (a/60 + 1) * 15;
        }
        StringBuilder sb = new StringBuilder();
        if(s1 < s2){
            sb.append("Y ").append(s1).append("\n");
        } else if (s1 > s2) {
            sb.append("M ").append(s2).append("\n");
        } else {
            sb.append("Y M ").append(s1).append("\n");
        }
        System.out.println(sb);
    }
}
