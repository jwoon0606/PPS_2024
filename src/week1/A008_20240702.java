package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A008_20240702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            double avg = sum / (double)N;

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (scores[j] > avg)
                    count++;
            }

            sb.append(String.format("%.3f",count/(double)N*100)).append("%").append("\n");
        }
        System.out.print(sb);
    }
}
