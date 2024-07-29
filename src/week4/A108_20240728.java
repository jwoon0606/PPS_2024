package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A108_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int belt = 0;
        int beltm = 1;

        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            if(s == 1) {
                if(belt == 0) belt = 1;

                else if(belt == 1) belt = 0;
            }
            beltm = (beltm / a) * b;
        }
        System.out.println(belt + " " + beltm);
    }
}
