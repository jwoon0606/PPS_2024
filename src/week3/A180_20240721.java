package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A180_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf((a+b)%c) + "\n");
        bw.write(String.valueOf(((a%c) + (b%c))%c) + "\n");
        bw.write(String.valueOf((a*b)%c) + "\n");
        bw.write(String.valueOf(((a%c) * (b%c))%c) + "\n");
        bw.flush();
        bw.close();
    }
}
