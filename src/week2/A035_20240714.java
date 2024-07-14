package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A035_20240714 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        double[] result = new double[T];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            result[i] = Double.parseDouble(st.nextToken());
            while(st.hasMoreTokens()){
                char c = st.nextToken().charAt(0);
                if(c == '@')
                    result[i] *= 3;
                else if(c == '%')
                    result[i] += 5;
                else if(c == '#')
                    result[i] -= 7;
            }
            sb.append(String.format("%.2f\n",result[i]));
        }
        System.out.print(sb);
    }
}
