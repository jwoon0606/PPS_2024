package week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A182_20240705 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(st.nextToken());
        long num2 = Long.parseLong(st.nextToken());
        long num3 = Long.parseLong(st.nextToken());

        long sum = num1 + num2 + num3;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}