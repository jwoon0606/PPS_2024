package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A030_20240728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        double good = 0;
        if(Integer.parseInt(st.nextToken()) == 0){
            good = 1;
        }

        st = new StringTokenizer(br.readLine());
        double[] per = new double[4];
        for (int i = 0; i < 4; i++) {
            per[i] = Double.parseDouble(st.nextToken());
        }

        for (int i = 0; i < N; i++) {
            good = good * per[0] + (1-good) * per[2];
        }

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%.0f\n",1000*good));
        sb.append(String.format("%.0f\n",1000*(1-good)));
        System.out.print(sb);
    }
}
