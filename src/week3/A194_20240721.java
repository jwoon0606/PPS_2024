package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class A194_20240721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] sums = new int[t];
        int[] num1 = new int[t];
        int[] num2 = new int[t];

        StringTokenizer st;
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            num1[i] = Integer.parseInt(st.nextToken());
            num2[i] = Integer.parseInt(st.nextToken());
            sums[i] = num1[i] + num2[i];
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<t; i++){
            bw.write("Case #" + (i+1) +": "+ num1[i] + " + " +num2[i] + " = "+ sums[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
