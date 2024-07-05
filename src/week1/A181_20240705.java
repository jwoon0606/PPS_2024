package week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class A181_20240705 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int num3 = num1 * (num2 % 10);
        int num4 = num1 * (num2 % 100 / 10);
        int num5 = num1 * (num2 / 100);
        int num6 = num3 + num4*10 + num5*100;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(num3)+"\n");
        bw.write(String.valueOf(num4)+"\n");
        bw.write(String.valueOf(num5)+"\n");
        bw.write(String.valueOf(num6)+"\n");
        bw.flush();
        bw.close();
    }
}