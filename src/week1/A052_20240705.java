package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A052_20240705 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        int OCount, sum;
        for (int i = 0; i < T; i++) {
            sum = OCount = 0;
            for(byte val : br.readLine().getBytes()){
                if((char)val == 'O')
                    sum += ++OCount;
                else OCount = 0;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}